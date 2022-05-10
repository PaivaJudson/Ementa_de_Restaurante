package com.example.ementa_de_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    Intent intent;
    String pedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                intent = getIntent();
                pedido = intent.getExtras().getString("pedido");
                intent = new Intent(SplashScreenActivity.this, ResumoPedidoActivity.class);
                intent.putExtra("pedido", pedido);
                startActivity(intent);
            }
        }, 5000);
    }
}