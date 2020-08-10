package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String num1;
    String num2;
    Button btn;

    EditText input1;
    EditText input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = findViewById(R.id.button);

         input1 = (EditText) findViewById(R.id.txt1);
         input2 = (EditText) findViewById(R.id.txt2);

         //Toast Message Defined
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num01 = input1.getText().toString();
                String num02 = input2.getText().toString();

                //Custom Toast Message
                /*Context context = getApplicationContext();
                CharSequence sequenceMsg = "You have just clicked the button";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, sequenceMsg, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
                toast.show();*/




                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Number01",num01);
                intent.putExtra("Number02",num02);
                startActivity(intent);
            }
        });
    }
}