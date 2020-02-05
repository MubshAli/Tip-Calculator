package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTV;
    TextView totalTextView;
    EditText billTotalEditView;
    Button tenP;
    Button fifteenP;
    Button twentyP;
    Button calculateB;
    EditText anyP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anyP = (EditText) findViewById(R.id.editText21);
        tipTotalTV = (TextView) findViewById(R.id.testView2);
        totalTextView = (TextView) findViewById(R.id.testView3);
        billTotalEditView = (EditText) findViewById(R.id.editText20);
        twentyP = (Button) findViewById(R.id.button9);
        fifteenP = (Button) findViewById(R.id.button10);
        tenP = (Button) findViewById(R.id.button11);
        calculateB = (Button) findViewById(R.id.button12);

        calculateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tipP =Double.valueOf(anyP.getText().toString());
                calcTheTip(tipP*0.01);
            }
        });
        tenP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Get the number for the edittext
                calcTheTip(0.1);

            }
        });
        twentyP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Get the number for the edittext
                calcTheTip(0.2);


            }
        });
        fifteenP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Get the number for the edittext
                calcTheTip(0.15);

            }
        });
    }
    void calcTheTip(Double tipPercentage){
        Double billTotal = Double.valueOf(billTotalEditView.getText().toString());

        //determine the tip

        Double tipTotal = billTotal * tipPercentage;
        //determine the Total

        //Display the tip

        tipTotalTV.setText("Tip - TK " + String.format("%.2f",tipTotal));

        //Determine the total

        Double total = tipTotal + billTotal;

        //Display the total

        totalTextView.setText("Total - TK " + String.format("%.2f",total));
    }
}
