package com.example.ementa_de_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResumoPedidoActivity extends AppCompatActivity {
    Intent intent;
    TextView txt_pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        intent = getIntent();
        txt_pedido = findViewById(R.id.txt_pedido);

        txt_pedido.setText(intent.getExtras().getString("pedido"));

    }
}