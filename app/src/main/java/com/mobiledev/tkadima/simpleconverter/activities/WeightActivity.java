package com.mobiledev.tkadima.simpleconverter.activities;


import android.os.Bundle;
import android.view.View;

import com.mobiledev.tkadima.simpleconverter.R;
import com.mobiledev.tkadima.simpleconverter.converters.WeightConverter;

import java.text.DecimalFormat;

/**
 * weight uses the same logic as Length Activity
 * with the WeightConverter class
 */
public class WeightActivity extends ConverterActivity
{
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);

        setAdapters(R.array.weight_units_array);

        _convertBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String firstUnit = _firstUnitSpinner.getSelectedItem().toString();
                String secondUnit = _secondUnitSpinner.getSelectedItem().toString();
                WeightConverter unit1 = new WeightConverter(firstUnit);
                WeightConverter unit2 = new WeightConverter(secondUnit);
                String baseUnit = unit1.baseUnit;

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                double unformattedDouble;
                String formatted;

                if (secondUnit.equals(baseUnit))
                {
                    unformattedDouble = unit1.toBase(Double.valueOf(_originalValue.getText().toString()));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                }
                else if (firstUnit.equals(baseUnit))
                {
                    unformattedDouble = unit2.fromBase(unit1.toBase(Double.valueOf(_originalValue.getText().toString())));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                }
                else
                {
                    unformattedDouble = unit2.fromBase(unit1.toBase(Double.valueOf(_originalValue.getText().toString())));
                    formatted = decimalFormat.format(unformattedDouble);
                    _convertedValue.setText(formatted);
                }
            }
        });
    }
}