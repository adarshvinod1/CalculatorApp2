package com.example.newcalulatorapp;

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

public class AdditionfActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b5,b6;
    String
    getNum1,getNum2,sum;
    Integer
    num1,num2,result;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_additionf);
        et1=(EditText) findViewById(R.id.n1);
        et2=(EditText) findViewById(R.id.n2);
        b5=(Button) findViewById(R.id.g);
        b6=(Button) findViewById(R.id.btm);
        tv1=(TextView) findViewById(R.id.r);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                result=num1+num2;
                sum=String.valueOf(result);
                Toast.makeText(getApplicationContext(),sum,Toast.LENGTH_SHORT).show();
                tv1.setText(sum);
            }
        });

    }
}