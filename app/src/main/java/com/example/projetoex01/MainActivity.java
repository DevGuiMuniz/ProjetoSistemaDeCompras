package com.example.projetoex01;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox cbArroz, cbLeite, cbCarne, cbFeijao, cbCoca;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cbArroz = findViewById(R.id.cbArroz);
        cbLeite = findViewById(R.id.cbLeite);
        cbCarne = findViewById(R.id.cbCarne);
        cbFeijao = findViewById(R.id.cbFeijao);
        cbCoca = findViewById(R.id.cbCoca);


        textResultado = findViewById(R.id.textResultado);
    }


    public void enviar(View view) {
        double total = 0;

        if (cbArroz.isChecked()) total += 2.69;
        if (cbLeite.isChecked()) total += 2.70;
        if (cbCarne.isChecked()) total += 16.70;
        if (cbFeijao.isChecked()) total += 3.38;
        if (cbCoca.isChecked()) total += 3.00;


        textResultado.setText(String.format("Total: R$ %.2f", total));
    }
}