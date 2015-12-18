package com.mobiledev.tkadima.simpleconverter.activities;

import android.os.Bundle;
import android.view.View;

import com.mobiledev.tkadima.simpleconverter.R;
import com.mobiledev.tkadima.simpleconverter.converters.LengthConverter;

import java.text.DecimalFormat;

public class LengthActivity extends ConverterActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setAdapters(R.array.length_units_array);

        _convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstUnit = _firstUnitSpinner.getSelectedItem().toString();
                String secondUnit = _secondUnitSpinner.getSelectedItem().toString();
                LengthConverter unit1 = new LengthConverter(firstUnit);
                LengthConverter unit2 = new LengthConverter(secondUnit);
                String baseUnit = unit1.baseUnit;

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                double unformattedDouble;
                String formatted;

                if (secondUnit.equals(baseUnit)) {
                    unformattedDouble = unit1.toBase(Double.valueOf(_originalValue.getText().toString()));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                } else if (firstUnit.equals(baseUnit)) {
                    unformattedDouble = unit2.fromBase(unit1.toBase(Double.valueOf(_originalValue.getText().toString())));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                } else {
                    unformattedDouble = unit2.fromBase(unit1.toBase(Double.valueOf(_originalValue.getText().toString())));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                }
            }
        });
    }
}




