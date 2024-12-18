package com.example.newcalulatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubtractionfActivity extends AppCompatActivity {
    EditText et3,et4;
    Button b7,b8;
    String
            getNum3,getNum4,sum1;
    Integer
            num3,num4,result1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtractionf);
        et3=(EditText) findViewById(R.id.n3);
        et4=(EditText) findViewById(R.id.n4);
        b7=(Button) findViewById(R.id.g1);
        b8=(Button) findViewById(R.id.btm1);
        tv2=(TextView) findViewById(R.id.r1);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum3=et3.getText().toString();
                getNum4=et4.getText().toString();
                num3=Integer.parseInt(getNum3);
                num4=Integer.parseInt(getNum4);
                result1=num3-num4;
                sum1=String.valueOf(result1);
                tv2.setText(sum1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}