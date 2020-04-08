package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    String value1;
    String value2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
    }
    public void sum(View view)
    {
        value1 = n1.getText().toString();
        value2= n2.getText().toString();

        int finalValue1=Integer.parseInt(value1);


        int finalValue2 = Integer.parseInt(value2);
        int n=finalValue1+finalValue2;

        Toast.makeText(getApplicationContext(),"SUM : "+n,Toast.LENGTH_SHORT).show();

    }

}
