package com.mobiledev.tkadima.simpleconverter.converters;

/**
 * This converter works differently than the other 3. It will only take in integers and use
 * preexisting
 */
public class NumberConverter {
    String _system;

    public NumberConverter(String system) {
        _system = system;
    }

    public String convertToHex(String input) {
        String result = input;
        if (_system.equals("decimal")) {
            Integer decimal = Integer.parseInt(input);
            result = Integer.toHexString(decimal);
        } else if (_system.equals("binary")) {
            Integer decimal = Integer.parseInt(input, 2);
            result = Integer.toHexString(decimal);
        }

        return result;
    }

    public String convertToBinary(String input) {
        String result = input;
        if (_system.equals("decimal")) {
            Integer decValue = Integer.parseInt(input);
            result = Integer.toBinaryString(decValue);
        } else if (_system.equals("hexadecimal")) {
            Integer decValue = Integer.parseInt(input, 16);
            result = Integer.toBinaryString(decValue);
        }
        return result;
    }

    public String convertToDecimal(String input)
    {
        String result = input;
        if (_system.equals("binary"))
        {
            Integer decValue = Integer.parseInt(input, 2);
            result = Integer.toString(decValue);
        }
        else if (_system.equals("hexadecimal"))
        {
            Integer decValue = Integer.parseInt(input, 16);
            result = Integer.toString(decValue);
        }
        return result;
    }

    public String getSystem() {
        return _system;
    }
}
