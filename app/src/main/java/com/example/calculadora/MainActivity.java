package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<num1> extends AppCompatActivity implements View.OnClickListener {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAC, btnMODULE, btnDIVISION, btnMULTI, btnSUB, btnSUM, btnEQUAL, btnBACKSPACE, btnCOMMA;
    private EditText ptDisplay, ptDisplay2;
    private TextView txtResult;
    protected Float num1 = Float.parseFloat("0"), num2 = Float.parseFloat("0");
    protected String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponent();

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnMODULE.setOnClickListener(this);
        btnDIVISION.setOnClickListener(this);
        btnMULTI.setOnClickListener(this);
        btnSUB.setOnClickListener(this);
        btnSUM.setOnClickListener(this);
        btnEQUAL.setOnClickListener(this);
        btnBACKSPACE.setOnClickListener(this);
        btnCOMMA.setOnClickListener(this);
    }

    private void initializeComponent () {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC = findViewById(R.id.btnAC);
        btnMODULE = findViewById(R.id.btnMODULE);
        btnDIVISION = findViewById(R.id.btnDIVISION);
        btnMULTI = findViewById(R.id.btnMULTI);
        btnSUB = findViewById(R.id.btnSUB);
        btnSUM = findViewById(R.id.btnSUM);
        btnEQUAL = findViewById(R.id.btnEQUAL);
        btnBACKSPACE = findViewById(R.id.btnBACKSPACE);
        btnCOMMA = findViewById(R.id.btnCOMMA);
        ptDisplay = findViewById(R.id.ptDisplay);
        ptDisplay2 = findViewById(R.id.ptDisplay2);
    }

    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.btn0:
                ptDisplay.append("0");
                break;

            case R.id.btn1:
                ptDisplay.append("1");
                break;

            case R.id.btn2:
                ptDisplay.append("2");
                break;

            case R.id.btn3:
                ptDisplay.append("3");
                break;

            case R.id.btn4:
                ptDisplay.append("4");
                break;

            case R.id.btn5:
                ptDisplay.append("5");
                break;

            case R.id.btn6:
                ptDisplay.append("6");
                break;

            case R.id.btn7:
                ptDisplay.append("7");
                break;

            case R.id.btn8:
                ptDisplay.append("8");
                break;

            case R.id.btn9:
                ptDisplay.append("9");
                break;

            case R.id.btnAC:
                ptDisplay.getText().clear();
                this.num1 = Float.parseFloat("0");
                this.num2 = Float.parseFloat("0");
                break;

            case R.id.btnMODULE:
                ptDisplay.append("%"); // call func calculation
                break;

            case R.id.btnDIVISION:
                ptDisplay.append("÷"); // call func calculation
                break;

            case R.id.btnMULTI:
                ptDisplay.append("×"); // call func calculation
                break;

            case R.id.btnSUB:
                ptDisplay.append("-"); // call func calculation
                break;

            case R.id.btnSUM:
                if (!ptDisplay.getText().toString().isEmpty()) {
                    if (!ptDisplay2.getText().toString().isEmpty()) {
                        ptDisplay2.getText().clear();
                        num1 = num1 + Float.parseFloat(ptDisplay.getText().toString());
                        ptDisplay2.append(num1 + " +");
                    } else {
                        this.num1 = Float.parseFloat(ptDisplay.getText().toString());
                        this.operation = "+";
                        ptDisplay.getText().clear();
                        ptDisplay2.append(num1 + " " + operation);
                    }
                    ptDisplay.getText().clear();
                }
                break;

            case R.id.btnEQUAL:
                ptDisplay.append("="); // call func calculation
                break;

            case R.id.btnBACKSPACE:
                String txt = ptDisplay.getText().toString();
                if (!txt.isEmpty()) {
                    ptDisplay.setText(txt.substring(0, txt.length() - 1));
                }
                break;

            case R.id.btnCOMMA:
                ptDisplay.append(",");
                break;
        }
    }

    private void attDisplay () {
        if (!num1.toString().isEmpty()) {
            //num1 + ptDisplay();
        }
    };
}