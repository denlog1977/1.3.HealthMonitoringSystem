package com.example.a13healthmonitoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextFIO = (EditText) findViewById(R.id.editTextFIO);
        final EditText editTextAge = (EditText) findViewById(R.id.editTextAge);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);

        Button buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String fio = editText5.getText();
                    //Integer.parseInt(editTextAge.getText().toString())
                    Patient patient = new Patient(editTextFIO.getText(), 12);
                }
            }
        );

        Button buttonPressure = (Button) findViewById(R.id.buttonPressure);
        buttonPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        Button buttonHealthIndicator = (Button) findViewById(R.id.buttonHealthIndicator);
        buttonHealthIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HealthIndicatorActivity.class);
                startActivity(intent);

//                MainActivity.this.finish();
            }
        });





    }
}
