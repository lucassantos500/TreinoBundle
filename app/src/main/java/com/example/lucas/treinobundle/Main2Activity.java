package com.example.lucas.treinobundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView Nome;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Nome = (TextView) findViewById(R.id.dadoId);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarId);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String dadoPassado = extra.getString("dado");
            Nome.setText(dadoPassado);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
