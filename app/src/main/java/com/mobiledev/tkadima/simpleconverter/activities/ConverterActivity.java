package com.mobiledev.tkadima.simpleconverter.activities;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.mobiledev.tkadima.simpleconverter.R;

/**
 * An activity represents the main screen with which a user can interact with an application.
 * The converter activity provides a mechanism by which the user can choose an unit to convert
 * to and from.
 * User enters a value and selects a unit from the list
 * User choose a unit to convert to and presses a button
 * App generates the converted value in the new unit
 * UI is created in general_conversion_layoutrsion_layout.xml
 */
public class ConverterActivity extends Activity {
    protected Spinner _firstUnitSpinner;
    protected Spinner _secondUnitSpinner;
    protected EditText _originalValue;
    protected Button _convertBtn;
    protected TextView _convertedValue;


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.general_conversion_layout);
        _firstUnitSpinner = (Spinner) findViewById(R.id.unitSpinnerFrom);
        _secondUnitSpinner = (Spinner) findViewById(R.id.unitSpinnerTo);
        _originalValue = (EditText) findViewById(R.id.fromValue);
        _convertBtn = (Button) findViewById(R.id.convertButton);
        _convertedValue = (TextView) findViewById(R.id.toValue);

    }


    public void setAdapters(int unitArrayId) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, unitArrayId,
                R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        _firstUnitSpinner.setAdapter(adapter);

        final ArrayAdapter<CharSequence> secondAdapter = ArrayAdapter.createFromResource(this, unitArrayId,
                R.layout.support_simple_spinner_dropdown_item);
        secondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        _secondUnitSpinner.setAdapter(secondAdapter);
    }


}