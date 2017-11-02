package com.example.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Bundle extras = getIntent().getExtras();
        String buttonChecked = extras.getString("selRadio");
        Log.e("Button checked","Button checked" + buttonChecked);
        String value = extras.getString("VALUE");
        Log.e("Value",value);

        TextView txtResult = (TextView)  findViewById(R.id.txtResult);
        Button btnBack = (Button) findViewById(R.id.btnBack);


        if (buttonChecked.equals("C")) {
            float f = ConverterUtil.convertFahrenheitToCelsius(Float.parseFloat(value));
            Log.e("Fahreinheit","Float:" +f);
            String msg = value + "F is " + f + "C";
            txtResult.setText(msg);
        } else {
            float f = ConverterUtil.convertCelsiusToFahrenheit(Float.parseFloat(value));
            Log.e("Celcius","Float:" +f);
            String msg = value + "C is " + f + "F";

            txtResult.setText(msg);

        }
        //txtResult.setText(value);
    }


    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }
}
