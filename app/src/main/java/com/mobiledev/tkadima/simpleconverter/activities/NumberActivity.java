package com.mobiledev.tkadima.simpleconverter.activities;

import java.math.BigInteger;
import java.util.HashMap;

import android.os.Bundle;
import android.view.View;
import com.mobiledev.tkadima.simpleconverter.R;

/**
 * Does not use the converter like the other features
 *
 */
public class NumberActivity extends ConverterActivity
{


    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setAdapters(R.array.number_system_array);

        _convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String firstSystem = _firstUnitSpinner.getSelectedItem().toString();
                String secondSystem = _secondUnitSpinner.getSelectedItem().toString();

                String[] systemsArray = getApplicationContext().getResources().getStringArray(R.array.number_system_array);

                String binary = getApplicationContext().getString(R.string.binary);
                String decimal = getApplicationContext().getString(R.string.decimal);
                String hexadecimal = getApplicationContext().getString(R.string.hexadecimal);

                HashMap<String, Integer> systemMap = new HashMap<String, Integer>();
                systemMap.put(binary, 2);
                systemMap.put(decimal, 10);
                systemMap.put(hexadecimal, 16);

                //numConversion( );
            }

        });
    }
    //given the system converting to and the base of the from
    public void numConversion(String toSystem,int base)
    {
        String toValue;
        if(toSystem.equals("decimal"))
        {
            int intValue = Integer.parseInt(_originalValue.toString(), base);
            toValue = Integer.toString(intValue);
            _convertedValue.setText(toValue);
        }
        else if (toSystem.equals("binary"))
        {
            BigInteger bigInteger = new BigInteger(_originalValue.getText().toString(), base);
            toValue = bigInteger.toString();
            _convertedValue.setText(toValue);
        }
        else if (toSystem.equals("hexadecimal"))
        {

        }
    }


}