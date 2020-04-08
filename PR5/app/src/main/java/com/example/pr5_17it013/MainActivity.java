package com.example.pr5_17it013;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;
    TextView result;
    int count = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (findViewById(R.id.e1));
        e2 = (findViewById(R.id.e2));
        b1 = (findViewById(R.id.b1));
        b2 = (findViewById(R.id.b2));
        result = (findViewById(R.id.result));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(e1.getText().toString(),e2.getText().toString());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void check(String name, String pass){
            if((name.equals("17it013") || name.equals("17IT013")) && (pass.equals("dp007") )){
                result.setText("Successfully Login");
                result.setBackgroundColor(Color.GREEN);

            }
            else{
                count--;
                result.setText("Inncorrect Username or Password");
                result.setBackgroundColor(Color.RED);

                if(count==0){
                    b1.setEnabled(false);
                }
                Toast.makeText(getApplicationContext(),String.valueOf(count)+" Attempts Remains",Toast.LENGTH_SHORT).show();
            }
    }
}
