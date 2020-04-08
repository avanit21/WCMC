package com.example.pr4_17it013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1;
    TextView result;
    double n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        e1 = findViewById(R.id.e1);
        result = findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double temp = Double.parseDouble(e1.getText().toString());
                n1 = (temp*1.8)+32;
                String new1 = n1 + " F";
                result.setText(String.valueOf(new1));
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(e1.getText().toString());
                n2 =  (temp-32)/1.8;
                String new2 = n2 + " C";
                result.setText(String.valueOf(new2));
            }
        });
    }
}
