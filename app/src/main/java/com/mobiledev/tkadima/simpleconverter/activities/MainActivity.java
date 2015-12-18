package com.mobiledev.tkadima.simpleconverter.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mobiledev.tkadima.simpleconverter.R;


public class MainActivity extends Activity {

    public Button _lengthBtn;
    public Button _weightBtn;
    public Button _currencyBtn;
    public Button _numbersBtn;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);

        _lengthBtn = (Button) findViewById(R.id.length_button);
        _weightBtn = (Button) findViewById(R.id.weight_button);
        _currencyBtn = (Button) findViewById(R.id.currency_button);
        _numbersBtn = (Button) findViewById(R.id.numbers_button);


        _lengthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseConversionActivity(LengthActivity.class);
            }
        });

        _weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseConversionActivity(WeightActivity.class);
            }
        });

        _currencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseConversionActivity(CurrencyActivity.class);
                //Toast.makeText(getApplicationContext(), "Coming soon!", Toast.LENGTH_LONG).show();
            }
        });

        _numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //chooseConversionActivity(NumberActivity.class);
                Toast.makeText(getApplicationContext(), "Coming soon!", Toast.LENGTH_LONG).show();
            }
        });

    }
    public void chooseConversionActivity(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }


}