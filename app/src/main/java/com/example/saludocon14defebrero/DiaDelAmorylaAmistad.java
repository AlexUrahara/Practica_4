package com.example.saludocon14defebrero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DiaDelAmorylaAmistad extends AppCompatActivity {

    private EditText text_txt8;
    private EditText text_txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_del_amoryla_amistad);

        text_txt8 = (EditText) findViewById(R.id.text_txt8);
    }


    //Metodo para el boton enviar saludo
    public void Enviar(View view) {
        Intent i = new Intent(this, unsaludo.class);
        i.putExtra("dato", text_txt8.getText().toString());
        startActivity(i);
    }
}