package com.example.gamerspotv2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegistroActivity extends AppCompatActivity {

    private EditText txtNick;
    private EditText txtEmail;
    private EditText txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Inicialización de los campos EditText
        txtNick = findViewById(R.id.txtNick);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);
    }

    // Método que se ejecuta al hacer clic en el botón de insertar
    public void clickBtnInsert(View view) {

        // URL del script PHP que se encargará de insertar los datos en la base de datos
        String url = "http://10.0.2.2:8080/gamerspot/api.php";  // Cambiar por la IP correcta de tu servidor

        // Crear la cola de solicitudes Volley
        com.android.volley.RequestQueue queue = Volley.newRequestQueue(this);

        // Crear la solicitud POST
        StringRequest resultadoPost = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Si la solicitud es exitosa
                        Toast.makeText(RegistroActivity.this, "Usuario insertado exitosamente", Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(com.android.volley.VolleyError error) {
                        // Imprimir el error detallado en Logcat
                        Log.e("Volley Error", error.toString());
                        // Mostrar el error en un Toast
                        Toast.makeText(RegistroActivity.this, "Error: " + error.toString(), Toast.LENGTH_LONG).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parametros = new HashMap<>();
                parametros.put("Nick", txtNick.getText().toString());
                parametros.put("email", txtEmail.getText().toString());
                parametros.put("pass", txtPass.getText().toString());
                return parametros;
            }
        };

        // Añadir la solicitud a la cola
        queue.add(resultadoPost);

    }

}
