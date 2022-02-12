package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNombre;
    Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.bt_login);
        miBoton.setOnClickListener(clik);
    }

    View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            edNombre= findViewById(R.id.et_name);
            String nombre= String.valueOf(edNombre.getText());
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("usuario", nombre);


            startActivity(intent);


            Toast.makeText(getBaseContext(),"Hola "+nombre, Toast.LENGTH_SHORT).show();

        }
    };




    /*public void clic (View vista){

        edNombre= findViewById(R.id.et_name);
        String nombre= String.valueOf(edNombre.getText());
        Toast.makeText(getBaseContext(),"Hola "+nombre, Toast.LENGTH_SHORT).show();
    }*/


}
