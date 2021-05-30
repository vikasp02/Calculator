package com.activity.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber ="";
    String op="+";
    boolean isNewOp=true;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);

    }
    public void numberEvent(View view){
        if (isNewOp)
            editText.setText("");
        isNewOp=false;
        String number= editText.getText().toString();
        switch (view.getId())
        {
            case R.id.bu7:
                number +="7";
                break;
            case R.id.bu8:
                number +="8";
                break;
            case R.id.bu9:
                number +="9";
                break;
            case R.id.bu4:
                number +="4";
                break;
            case R.id.bu5:
                number +="5";
                break;
            case R.id.bu6:
                number +="6";
                break;
            case R.id.bu1:
                number +="1";
                break;
            case R.id.bu2:
                number +="2";
                break;
            case R.id.bu3:
                number +="3";
                break;
            case R.id.bu0:
                number +="0";
                break;
            case R.id.PlusMinus:
                number +="-"+number;
                break;
            case R.id.buPoint:
                number +=".";
                break;
        }
        editText.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp=true;
        oldNumber=editText.getText().toString();
        switch (view.getId()) {
            case R.id.buDivide:
                op = "/";
                break;
            case R.id.buMulitply:
                op = "*";
                break;
            case R.id.buAdd:
                op = "+";
                break;
            case R.id.buMinus:
                op = "-";
                break;


        }
    }

    public void equalEvent(View view) {
        String newNumber =editText.getText().toString();
        double result=0.0;
        switch (op){
            case "+":
                result=Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case "-":
                result=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case "*":
                result=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case "/":
               result=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        editText.setText(result+"");
    }

    public void acEvent(View view) {
        editText.setText("0");
        isNewOp=true;
    }

    public void percentEvent(View view) {
        double no= Double.parseDouble(editText.getText().toString());
        editText.setText(no+"");
        isNewOp=true;
    }

    public void backSpace(View view) {
    }
}