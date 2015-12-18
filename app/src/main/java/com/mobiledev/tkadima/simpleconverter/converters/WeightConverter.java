package com.mobiledev.tkadima.simpleconverter.converters;

public class WeightConverter extends Converter {
    final private double G_TO_KILO = 0.001;
    final private double OZ_TO_KILOS = 0.0283495;
    final private double LBS_TO_KILOS = 0.453592;
    final private double STONE_TO_KILOS = 6.35029;

    public WeightConverter(String unit) {
        baseUnit = "kilograms";

        if (unit.equals("grams")) {
            factor = G_TO_KILO;
        } else if (unit.equals("ounces")) {
            factor = OZ_TO_KILOS;
        } else if (unit.equals("pounds")) {
            factor = LBS_TO_KILOS;
        } else if (unit.equals("stone")) {
            factor = STONE_TO_KILOS;
        }
        else if (unit.equals(baseUnit)) {
            factor = 1;
        }
    }
}