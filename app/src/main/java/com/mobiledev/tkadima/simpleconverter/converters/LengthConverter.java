package com.mobiledev.tkadima.simpleconverter.converters;

/**
 * Calculates the different conversion cases. There are 8 units each one needs to be able to convert to
 * 7 others. The amount of ways the units can paired up (where order matters) is about 64. In order to avoid this
 * convert from any selected unit to meter then convert from meter to the desired unit.
 */
public class LengthConverter extends Converter {

    final private double CENT_TO_METER = .01;
    final private double INCH_TO_METER = 0.0254;
    final private double DEC_TO_METER = 0.1;
    final private double FOOT_TO_METER = 0.3048;
    final private double YARD_TO_METER = 0.9144;
    final private double KILO_TO_METER = 1000;
    final private double MILE_TO_METER = 1609.34;


    public LengthConverter(String unit) {
        baseUnit = "meters";

        if (unit.equals("centimeter")) {
            factor = CENT_TO_METER;
        } else if (unit.equals("decimeter")) {
            factor = DEC_TO_METER;
        } else if (unit.equals("inches")) {
            factor = INCH_TO_METER;
        } else if (unit.equals("feet")) {
            factor = FOOT_TO_METER;
        } else if (unit.equals("yards")) {
            factor = YARD_TO_METER;
        } else if (unit.equals("kilometers")) {
            factor = KILO_TO_METER;
        } else if (unit.equals("miles")) {
            factor = MILE_TO_METER;
        }
        else if (unit.equals(baseUnit)){
            factor = 1;
        }

    }


}

