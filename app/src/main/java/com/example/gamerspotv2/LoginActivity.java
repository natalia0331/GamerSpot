package com.example.gamerspotv2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Asegúrate de que el archivo XML tenga este nombre.

        // Inicializar componentes de la interfaz
        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        // Configurar el botón para iniciar sesión
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarSesion();
            }
        });
    }


    private void iniciarSesion() {
        // URL de la API para el login
        String url = "http://10.0.2.2:8080/gamerspot/api.php?action=getUsers"; // Cambia la IP según sea necesario

        // Crear la cola de solicitudes Volley
        com.android.volley.RequestQueue queue = Volley.newRequestQueue(this);

        // Crear la solicitud POST
        StringRequest loginRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Procesar la respuesta del servidor
                        Log.d("Login Response", response);
                        if (response.contains("\"status\":\"ok\"")) {
                            Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_LONG).show();
                            // Aquí puedes navegar a otra actividad o pantalla principal
                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                            startActivity(intent);
                            finish(); // Finalizar la actividad actual para que no regrese al login

                    } else {
                            Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_LONG).show();
                        }
                    }
                },
                error -> {
                    // Manejar errores
                    Log.e("Volley Error", error.toString());
                    Toast.makeText(LoginActivity.this, "Error: " + error.toString(), Toast.LENGTH_LONG).show();
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parametros = new HashMap<>();
                String email = etUsuario.getText().toString();
                String password = etPassword.getText().toString();

                Log.d("Login Params", "Email: " + email + ", Password: " + password);

                parametros.put("email", email);
                parametros.put("password", password);
                return parametros;
            }



        };

        // Añadir la solicitud a la cola
        queue.add(loginRequest);
    }
}
