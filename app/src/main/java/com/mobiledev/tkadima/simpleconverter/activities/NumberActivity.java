package com.mobiledev.tkadima.simpleconverter.activities;

import android.os.Bundle;
import android.view.View;

import com.mobiledev.tkadima.simpleconverter.R;

/**
 * Does not use the converter like the other features
 *
 */
public class NumberActivity extends ConverterActivity {


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setAdapters(R.array.number_system_array);

        _convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_LONG);
            }
        });


    }
}