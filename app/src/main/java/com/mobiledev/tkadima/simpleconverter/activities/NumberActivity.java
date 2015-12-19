package com.mobiledev.tkadima.simpleconverter.activities;

import android.os.Bundle;
import android.view.View;

import com.mobiledev.tkadima.simpleconverter.R;
import com.mobiledev.tkadima.simpleconverter.converters.NumberConverter;

/**
 * Does not use the converter like the other features
 */
public class NumberActivity extends ConverterActivity {


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setAdapters(R.array.number_system_array);

        _convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstSystem = _firstUnitSpinner.getSelectedItem().toString();
                String secondSystem = _secondUnitSpinner.getSelectedItem().toString();
                NumberConverter converterFrom = new NumberConverter(firstSystem);
                NumberConverter converterTo = new NumberConverter(secondSystem);


                if (converterTo.getSystem().equals("binary")) {
                    _convertedValue.setText(converterFrom.convertToBinary(_originalValue.toString()));
                } else if (converterTo.getSystem().equals("decimal")) {
                    _convertedValue.setText(converterFrom.convertToDecimal(_originalValue.toString()));
                } else if (converterTo.getSystem().equals("hexadecimal")) {
                    _convertedValue.setText(converterFrom.convertToHex(_originalValue.toString()));
                }
            }
        });


    }
}