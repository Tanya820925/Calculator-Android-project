package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class CalculatorActivity extends AppCompatActivity
    implements View.OnClickListener
{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    TextInputLayout screen;
    Button addition, multiply, divide, subtract, equal, clear,home;
    EditText display;
    StringBuffer input1=new StringBuffer();
    StringBuffer input2=new StringBuffer();
    String  str1,str2;
    boolean isOperand = false;
    int operand;
    int num1,num2,result,id;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //for text views
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);





        //for button with operations
        addition = findViewById(R.id.addition);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        subtract = findViewById(R.id.subtract);

        //for equal to button
        equal = findViewById(R.id.equal);

        //for screen field
        screen = findViewById(R.id.screen);
        display= findViewById(R.id.display);


        display.setShowSoftInputOnFocus(false);


        //for clear button
        clear = findViewById(R.id.clear);



        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        addition.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);

        

        }



            @Override
            public void onClick(View v){



        int id = v.getId();

        if (!isOperand ) {


            switch(id) {



        case R.id.b0:
            input1.append("0");
            display.setText(input1.toString());
            break;

        case R.id.b1:
            input1.append("1");
            display.setText(input1.toString());
            break;
        case R.id.b2:
            input1.append("2");
            display.setText(input1.toString());
            break;
        case R.id.b3:
            input1.append("3");
            display.setText(input1.toString());
            break;
        case R.id.b4:
            input1.append("4");
            display.setText(input1.toString());
            break;
        case R.id.b5:
            input1.append("5");
            display.setText(input1.toString());
            break;
        case R.id.b6:
            input1.append("6");
            display.setText(input1.toString());
            break;
        case R.id.b7:
            input1.append("7");
            display.setText(input1.toString());
            break;
        case R.id.b8:
            input1.append("8");
            display.setText(input1.toString());
            break;
        case R.id.b9:
            input1.append("9");
            display.setText(input1.toString());
            break;


    }
    str1 = input1.toString();

}
                else {
            input2.append("");

    switch(id) {



        case R.id.b0:
            input2.append("0");
            display.setText(input2.toString());
            break;

        case R.id.b1:
            input2.append("1");
            display.setText(input2.toString());
            break;
        case R.id.b2:
            input2.append("2");
            display.setText(input2.toString());
            break;
        case R.id.b3:
            input2.append("3");
            display.setText(input2.toString());
            break;
        case R.id.b4:
            input2.append("4");
            display.setText(input2.toString());
            break;
        case R.id.b5:
            input2.append("5");
            display.setText(input2.toString());
            break;
        case R.id.b6:
            input2.append("6");
            display.setText(input2.toString());
            break;
        case R.id.b7:
            input2.append("7");
            display.setText(input2.toString());
            break;
        case R.id.b8:
            input2.append("8");
            display.setText(input2.toString());
            break;
        case R.id.b9:
            input2.append("9");
            display.setText(input2.toString());
            break;


    }
    str2 = input2.toString();
                }

                switch (id) {

                case R.id.addition:
                    display.setText(display.getText() + "+");
                    operand = 0;
                    isOperand = true;
                    break;
                case R.id.subtract:
                    display.setText(display.getText() + "-");
                    operand = 1;
                    isOperand = true;
                    break;
                case R.id.multiply:
                    display.setText(display.getText() + "*");
                    operand = 2;
                    isOperand = true;
                    break;
                case R.id.divide:
                    display.setText(display.getText() + "/");
                    operand = 3;
                    isOperand = true;
                    break;
                case R.id.equal:
                    num1 = Integer.parseInt(str1);
                    num2 = Integer.parseInt(str2);
                    if (operand == 0) {
                        result = num1 + num2;
                    } else if (operand == 1) {
                        result = num1 - num2;
                    } else if (operand == 2) {
                        result = num1 * num2;
                    } else if (operand == 3) {
                        result = num1 / num2;
                    }
                    display.setText(Integer.toString(result));

                    input1.append("");
                    input2.append("");

                    operand = -1;
                    result = -1;
                    isOperand = false;
                    break;
                case R.id.clear:
                    display.setText("");
                    input1.delete(0,input1.length());
                    input2.delete(0,input2.length());
                    operand = -1;
                    isOperand = false;
                    break;

            }

}}












