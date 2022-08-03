package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCadastro(View view){
        //Intent Explícita
        //Intent intent = new Intent(this, CadastroActivity.class);
        //startActivity(intent);

        //Intent Implícita
        Intent intent = new Intent("com.example.intent.CADASTRO");
        startActivity(intent);
    }

    public void openConfig(View view){
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }

    public void openBrowser(View view){
        Uri uri = Uri.parse("http://www.android.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}