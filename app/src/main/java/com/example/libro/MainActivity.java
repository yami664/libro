package com.example.libro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText libro;
    private Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libro=findViewById(R.id.ETlibro);
        buscar=findViewById(R.id.BTBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,busquedalibro.class);
                intent.putExtra("libro",libro.getText().toString());
                startActivity(intent);
            }
        });

    }
}