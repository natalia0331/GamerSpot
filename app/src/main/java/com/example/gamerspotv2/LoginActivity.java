package com.example.gamerspotv2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.gamerspotv2.loginModel.UserResponse;
import com.example.gamerspotv2.models.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario, etPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(v -> loginUser());
    }

    private void loginUser() {
        String email = etUsuario.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Configuración de Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.101.11:8080/")  // URL base de tu servidor
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        // Realiza la solicitud GET para obtener los usuarios
        apiService.getUsers().enqueue(new Callback<List<UserResponse>>() {
            @Override
            public void onResponse(Call<List<UserResponse>> call, Response<List<UserResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<UserResponse> users = response.body();
                    boolean isValidUser = false;


                    for (UserResponse user : users) {
                        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                            isValidUser = true;
                            break;
                        }
                    }

                    if (isValidUser) {
                        Toast.makeText(LoginActivity.this, "Bienvenido!", Toast.LENGTH_SHORT).show();
                        // Redirige al usuario a la página principal
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Error al obtener los usuarios", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<UserResponse>> call, Throwable t) {
                // Manejo de error
                Toast.makeText(LoginActivity.this, "Error al conectar con el servidor", Toast.LENGTH_SHORT).show();
                Log.e("LoginActivity", "Error: " + t.getMessage());
            }
        });
    }
}
