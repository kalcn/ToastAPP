package com.kalcn.tosatapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int num1,num2,numSum;
    private TextView txvNum1,txvNum2,txvAns,txvMyAns;
    private EditText edtMyans;
    private String result;
    //U1065111 蔡旻錡

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


    public void btnPlayAgain(View view) {
        edtMyans.setText("");
        resetNumber();
    }

    public void btnOK(View view) {
        numSum = num1 + num2;

        String sum = String.valueOf(numSum);
        txvAns.setText("正確答案是："+sum);
        String myAns = edtMyans.getText().toString();
        txvMyAns.setText("我的答案是："+ myAns);

        if(myAns.equals(sum)){
            result = "恭喜你！答對了！";
            new AlertDialog.Builder(this)
                    .setMessage(result)
                    .setTitle("答題結果")
                    .setPositiveButton("確定",null)
                    .show();
        }
        else{
            result = "答錯了！加油！";
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        }
    }
}
