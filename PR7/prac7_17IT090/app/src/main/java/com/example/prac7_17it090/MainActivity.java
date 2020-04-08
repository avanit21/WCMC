package com.example.prac7_17it090;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_pr7,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        text1.setText("");
        RelativeLayout r1 = (RelativeLayout)findViewById(R.id.bgrnd_id);
        switch(item.getItemId()){
            case R.id.blue1:
                r1.setBackgroundColor(Color.BLUE);
                text2.setText("BLUE");
                text2.setBackgroundColor(Color.WHITE);
                Toast.makeText(this, "BLUE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.red1:
                r1.setBackgroundColor(Color.RED);
                text2.setText("RED");
                text2.setBackgroundColor(Color.WHITE);
                Toast.makeText(this, "RED", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.green1:
                r1.setBackgroundColor(Color.GREEN);
                text2.setText("GREEN");
                text2.setBackgroundColor(Color.WHITE);
                Toast.makeText(this, "GREEN", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.yellow1:
                text2.setText("YELLOW");
                r1.setBackgroundColor(Color.YELLOW);
                text2.setBackgroundColor(Color.WHITE);
                Toast.makeText(this, "YELLOW", Toast.LENGTH_SHORT).show();
                return true;

            default:
                Toast.makeText(this, "Nothing is selected", Toast.LENGTH_SHORT).show();
                return true;
        }
    }
}
