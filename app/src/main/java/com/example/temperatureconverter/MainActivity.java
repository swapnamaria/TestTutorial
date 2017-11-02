package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;
    ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
        Context context;


    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        String inputValue = text.getText().toString();
        String buttonChecked = "C";

        switch (view.getId()) {
            case R.id.button1:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                //float inputValue = Float.parseFloat(text.getText().toString());


                if (celsiusButton.isChecked()) {
                    buttonChecked = "C";
                    celsiusButton.setChecked(true);
                    fahrenheitButton.setChecked(false);
                }
                else {
                    buttonChecked = "F";
                    fahrenheitButton.setChecked(true);
                    celsiusButton.setChecked(false);

                }
                Log.d("Button checked",buttonChecked);

                break;


        }

        startActivity(CreateIntent(getApplicationContext(),buttonChecked,inputValue));

    }

    public static Intent CreateIntent(Context context, String buttonChecked, String inputValue) {
        Intent intent = new Intent(context, DisplayResultActivity.class);

        intent.putExtra("selRadio", buttonChecked);
        intent.putExtra("VALUE", inputValue);

        return intent;
    }
}