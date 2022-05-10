package com.example.ementa_de_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check_cafe;
    CheckBox check_agua;
    CheckBox check_leite;
    CheckBox check_gelado;
    CheckBox check_sumo;
    Button btn_pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_cafe = findViewById(R.id.check_cafe);
        check_agua = findViewById(R.id.check_agua);
        check_gelado = findViewById(R.id.check_gelado);
        check_leite = findViewById(R.id.check_leite);
        check_sumo = findViewById(R.id.check_sumo);
        btn_pedido = findViewById(R.id.btn_pedido);

        btn_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pedido = "";
                if(check_cafe.isChecked()) pedido = pedido + "1 Café \n";
                if(check_agua.isChecked()) pedido = pedido + "1 Água \n";
                if(check_gelado.isChecked()) pedido = pedido + "1 Gelado \n";
                if(check_sumo.isChecked()) pedido = pedido + "1 Sumo \n";
                if(check_leite.isChecked()) pedido = pedido + "1 Meia de Leite Leite \n";

                if(pedido.equals("")){
                    Toast.makeText(MainActivity.this, "Pedido Inválido", Toast.LENGTH_LONG).show();
                }else{
                    Intent i = new Intent(MainActivity.this, SplashScreenActivity.class);
                    i.putExtra("pedido", pedido);
                    startActivity(i);
                }
            }
        });

    }
}