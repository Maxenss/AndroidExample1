package com.easylabs.androidexample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btSum;
    Button btSub;
    EditText etOperand1;
    EditText etOperand2;
    TextView txAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSum = (Button) findViewById(R.id.btSum);
        btSub = (Button) findViewById(R.id.btSub);

        etOperand1 = (EditText) findViewById(R.id.etOperand1);
        etOperand2 = (EditText) findViewById(R.id.etOperand2);
        txAnswer = (TextView) findViewById(R.id.txAnswer);


        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(etOperand1.getText().toString());
                double oper2 = Double.parseDouble(etOperand2.getText().toString());
                double res = oper1 + oper2;
                txAnswer.setText(res + "");
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(etOperand1.getText().toString());
                double oper2 = Double.parseDouble(etOperand2.getText().toString());
                double sub = oper1 - oper2;
                txAnswer.setText(sub + "");
            }
        });
    }
}
