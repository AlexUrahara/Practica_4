package com.example.saludocon14defebrero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class unsaludo extends AppCompatActivity {

    private TextView text_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsaludo);

        text_10 = (TextView)findViewById(R.id.text_10);

        String dato =getIntent().getStringExtra("dato");
        text_10.setText(dato + " solo quiero que sepas que eres una persona maravillosa que sin duda a causado un gran impacto positivo en mi vida.");

    }
    //metodo para el voton de regresar
    public void volverinicio(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}