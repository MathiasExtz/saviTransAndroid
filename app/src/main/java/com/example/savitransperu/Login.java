package com.example.savitransperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText email;
    EditText pass;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.et_correo);
        pass = findViewById(R.id.et_contrasena);
        ingresar = findViewById(R.id.iniciar_sesion);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateEmail(email) && validatePass(pass)){
                    ListadoViaje(view);
                }
            }
        });
    }

    //Metodo para el boton anterior
    public void Registro(View view){
        Intent registro = new Intent(this, Registros.class);
        startActivity(registro);
    }

    public void ListadoViaje(View view){
        Intent listado = new Intent(this, ListadoViajes.class);
        startActivity(listado);
    }

    public void PruebaCard(View view){
        Intent pruebacard = new Intent(this, ListadoViajesCard.class);
        startActivity(pruebacard);
    }

    private boolean validateEmail(EditText email){
        String emailInput = email.getText().toString();
        if (!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            return true;
        } else {
            Toast.makeText(this, "Correo o Contraseña invalidos", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    private boolean validatePass(EditText pass){
        String passInput = pass.getText().toString();
        if (passInput.length() > 8) {
            return true;
        } else {
            Toast.makeText(this, "Correo o Contraseña invalidos", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
