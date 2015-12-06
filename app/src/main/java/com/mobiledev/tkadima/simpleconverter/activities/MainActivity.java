package com.mobiledev.tkadima.simpleconverter.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.mobiledev.tkadima.simpleconverter.R;


public class MainActivity extends Activity {

    GridView _gridView;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);

        _gridView = (GridView) findViewById(R.id.gridViewMain);



        /*
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
            }
        });

        _numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseConversionActivity(NumberActivity.class);
            }
        }); */

       /* _hamburgerImageView.setVisibility(View.VISIBLE);
        Drawable drawable = _hamburgerImageView.getDrawable();
       drawable.setBounds(0, 0, 50, 50); */


    }


    public void chooseConversionActivity(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }


}