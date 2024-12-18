package com.example.newcalulatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultipicationfActivity extends AppCompatActivity {
    EditText et5,et6;
    Button b9,b10;
    String
            getNum5,getNum6,sum2;
    Integer
            num5,num6,result2;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multipicationf);
        et5=(EditText) findViewById(R.id.n5);
        et6=(EditText) findViewById(R.id.n6);
        b9=(Button) findViewById(R.id.g2);
        b10=(Button) findViewById(R.id.btm2);
        tv3=(TextView) findViewById(R.id.r2);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum5=et5.getText().toString();
                getNum6=et6.getText().toString();
                num5=Integer.parseInt(getNum5);
                num6=Integer.parseInt(getNum6);
                result2=num5*num6;
                sum2=String.valueOf(result2);
                tv3.setText(sum2);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}