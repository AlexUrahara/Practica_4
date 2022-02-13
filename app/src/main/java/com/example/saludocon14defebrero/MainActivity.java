package com.example.saludocon14defebrero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Salir=(Button) findViewById(R.id.button2);

        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"haz salido de la app", Toast.LENGTH_LONG).show();
                Log.i("ERROR4","hiciste clic en salir");
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void iraregistrara (View view){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
    public void especial14defeb (View view){
        Intent i = new Intent(this, DiaDelAmorylaAmistad.class);
        startActivity(i);
    }




}