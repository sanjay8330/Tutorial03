package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String num1;
    String num2;

    TextView txt;
    TextView txt0;
    TextView txt1;

    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = findViewById(R.id.textView6);
        txt0 = findViewById(R.id.textView7);
        txt1 = findViewById(R.id.textView5);

        Intent secIntent = getIntent();
        num1 = secIntent.getStringExtra("Number01");
        num2 = secIntent.getStringExtra("Number02");

        txt.setText(num1);
        txt0.setText(num2);
        txt1.setText("----------------------");

        btn = findViewById(R.id.button2);
        btn1 = findViewById(R.id.button3);
        btn2 = findViewById(R.id.button4);
        btn3 = findViewById(R.id.button5);
        btn4 = findViewById(R.id.button6);


    }

    @Override
    protected void onResume() {
        super.onResume();

        final int no1 = Integer.parseInt(num1);
        final int no2 = Integer.parseInt(num2);


        btn.setOnClickListener(new View.OnClickListener() {
            int total;
            @Override
            public void onClick(View view) {
                total = no1 + no2;
                txt1.setText(no1+" + "+no2+ " = "+total);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            int total;
            @Override
            public void onClick(View view) {
                total = no1 - no2;
                txt1.setText(no1+" - "+no2+" = "+total);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            int total;
            @Override
            public void onClick(View view) {
                total = no1 * no2;
                txt1.setText(no1+" x "+no2+" = "+total);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            double total;
            @Override
            public void onClick(View view) {
                total = ((double) no1) / no2;
                txt1.setText(no1+" / "+no2+" = "+total);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent2);

            }
        });
    }
}