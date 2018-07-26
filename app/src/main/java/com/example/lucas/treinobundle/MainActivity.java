package com.example.lucas.treinobundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText dado;
    private Button botaoPassarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado = (EditText) findViewById(R.id.dadoNomeId);
        botaoPassarDados = (Button) findViewById(R.id.botaoPassarDadosId);

        botaoPassarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NomeA = dado.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("dado",NomeA);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Passando " +NomeA+  " para outra activity",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
