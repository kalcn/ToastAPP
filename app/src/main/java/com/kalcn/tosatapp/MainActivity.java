package com.kalcn.tosatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num1,num2,numSum;
    private TextView txvNum1,txvNum2,txvAns,txvMyAns;
    private EditText edtMyans;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        resetNumber();
    }

    private void findViews(){
        txvNum1=findViewById(R.id.tevNum1);
        txvNum2=findViewById(R.id.tevNum2);
        txvAns=findViewById(R.id.tevAns);
        txvMyAns=findViewById(R.id.tevMyAns);
        edtMyans=findViewById(R.id.edtMyans);
    }

    private void resetNumber(){
        num1 = (int)(Math.random()*10);
        num2 = (int)(Math.random()*10);
        txvNum1.setText(String.valueOf(num1));
        txvNum2.setText(String.valueOf(num2));
    }

    

}
