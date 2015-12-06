package com.mobiledev.tkadima.simpleconverter.converters;


public class CurrencyConverter extends Converter
{
    final double YEN_TO_USD = 0.0081;
    final double KRONA_TO_USD = 0.11;
    final double HKD_TO_USD = 0.13;
    final double AUD_TO_USD = 0.72;
    final double CAD_TO_USD = 0.75;
    final double FRANC_TO_USD = 0.97;
    final double EURO_TO_USD = 1.06;
    final double POUND_TO_USD = 1.50;
    final double BITCOIN_TO_USD = 376.29;

    public CurrencyConverter (String currency)
    {
        baseUnit = "US Dollar"; //because 'Murica

        if(currency.equals("yen"))
        {
            factor = YEN_TO_USD;
        }
        else if (currency.equals("krona"))
        {
            factor = KRONA_TO_USD;
        }
        else if (currency.equals("Hong Kong Dollar"))
        {
            factor = HKD_TO_USD;
        }
        else if (currency.equals("Australian Dollar"))
        {
            factor = AUD_TO_USD;
        }
        else if (currency.equals("Canadian Dollar"))
        {
            factor = CAD_TO_USD;
        }
        else if (currency.equals("Swiss franc"))
        {
            factor = FRANC_TO_USD;
        }
        else if (currency.equals("euro"))
        {
            factor = EURO_TO_USD;
        }
        else if (currency.equals("British Pound"))
        {
            factor = POUND_TO_USD;
        }
        else if (currency.equals("bitcoin")) {
            factor = BITCOIN_TO_USD;
        }

    }
}