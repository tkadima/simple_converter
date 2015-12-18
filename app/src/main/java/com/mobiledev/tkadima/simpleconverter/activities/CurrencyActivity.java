package com.mobiledev.tkadima.simpleconverter.activities;

import android.os.Bundle;
import android.view.View;

import com.mobiledev.tkadima.simpleconverter.R;
import com.mobiledev.tkadima.simpleconverter.converters.CurrencyConverter;

import java.text.DecimalFormat;

/**
 * currency will work differently than the other activities since conversion rates often change
 * for now will use 2015 conversion rates and later try to get binding API that will update
 * the conversion rates.
 */
public class CurrencyActivity extends ConverterActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setAdapters(R.array.currencies_array);
        _convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstCurrency = _firstUnitSpinner.getSelectedItem().toString();
                String secondCurrency = _secondUnitSpinner.getSelectedItem().toString();
                CurrencyConverter unit1 = new CurrencyConverter(firstCurrency);
                CurrencyConverter unit2 = new CurrencyConverter(secondCurrency);
                String baseUnit = unit1.baseUnit;


                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                double unformattedDouble;
                String formatted;

                if (secondCurrency.equals(baseUnit)) {
                    unformattedDouble = unit1.toBase(Double.valueOf(_originalValue.getText().toString()));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                } else if (firstCurrency.equals(baseUnit)) {
                    unformattedDouble = unit2.fromBase(Double.valueOf(_originalValue.getText().toString()));
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