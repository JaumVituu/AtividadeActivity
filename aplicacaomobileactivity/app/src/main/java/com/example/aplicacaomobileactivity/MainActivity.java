package com.example.aplicacaomobileactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void enviarmsg(View view) {


        Intent it = new Intent(this, tela2.class);
        EditText txt = (EditText) findViewById(R.id.editTextTextPersonName);

        String msg = txt.getText().toString();
        it.putExtra("MENSAGEM", msg);

        startActivity(it);

    }
    public final static String MENSAGEM = "com.example.aplicacaomobileactivity";


}