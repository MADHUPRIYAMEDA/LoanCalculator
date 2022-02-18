package com.example.loancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void result(View view) {
    int    timePeriod []={5,10,15,20,25,30};
        EditText money =(EditText) findViewById(R.id.money);
        EditText emi =(EditText) findViewById(R.id.emi);
        TextView sol =(TextView) findViewById(R.id.sol);
        int total_money=Integer.parseInt(money.getText().toString());
        double total_emi=Integer.parseInt(emi.getText().toString());
        for(int i=0 ;i<timePeriod.length;i++){
    int   period=timePeriod[i];
      double result= ((total_money * (total_emi/100)/12) / (1 - Math.pow(1 + (total_emi/100)/12, -period)));
sol.append("monthly payment :"+result+"\n");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}