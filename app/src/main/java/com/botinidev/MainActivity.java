package com.botinidev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText alcoo,gasolina;
    private TextView resultado;

    String TAG = "Botao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_calcular);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alcoo = findViewById(R.id.editTextAlcoo);
                gasolina = findViewById(R.id.editTextGasolina);
                resultado = findViewById(R.id.resultado);
                String  resulAlcoo = "Vale mais a pena usar Álcool!";
                String  resulGasolina = "Vale mais a pena usar Gasolina!";

                String editAlcoo = alcoo.getText().toString();
                String editGasolina = gasolina.getText().toString();
                double resulFinal = (Double.parseDouble(editAlcoo) / Double.parseDouble(editGasolina));
                Log.i(TAG, "onClick: Clicou "+editAlcoo);
                Log.i(TAG, "onClick: Clicou "+editGasolina);
                Log.i(TAG, "onClick: Clicou "+resulFinal);

                if (resulFinal > 0.7){
                    resultado.setText(resulGasolina);
                }else{
                    resultado.setText(resulAlcoo);
                }

            }
        });
    }


}