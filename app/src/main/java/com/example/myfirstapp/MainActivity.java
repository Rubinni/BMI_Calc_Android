package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculate(View v){

        EditText userhight = findViewById(R.id.userheight);
        EditText userweight = findViewById(R.id.userweight);
        TextView textView = findViewById(R.id.textView2);

        double height = Double.parseDouble(userhight.getText().toString());
        double weight = Double.parseDouble(userweight.getText().toString());

        double BMI = weight /(height * height);

        textView.setText(Double.toString(BMI));




    }


}
