package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    float num1=0,num2=0,ans=0;
    Button a,s,m,d;
    EditText n1,n2;
    TextView result;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        a=(Button) findViewById(R.id.add);
        s=(Button) findViewById(R.id.sub);
        d=(Button) findViewById(R.id.div);
        m=(Button) findViewById(R.id.mul);
        result=(TextView) findViewById(R.id.ans);

        a.setOnClickListener(this);
        s.setOnClickListener(this);
        d.setOnClickListener(this);
        m.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        num1=Float.parseFloat(n1.getText().toString());
        num2=Float.parseFloat(n2.getText().toString());
        String op="";
        switch(v.getId())
        {
            case R.id.add:
            {
                op="+";
                ans=num1+num2;
                break;
            }
            case R.id.sub:
            {
                op="-";
                ans=num1-num2;
                break;
            }
            case R.id.mul:
            {
                op="*";
                ans=num1*num2;
                break;
            }
            case R.id.div:
            {
                op="/";
                ans=num1/num2;
                break;
            }
            default:
                result.setText("");

        }

        result.setText(num1+" " +op+" "+num2+"="+ans);
    }
}