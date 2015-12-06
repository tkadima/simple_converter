package com.mobiledev.tkadima.simpleconverter.converters;

/**
 * the abstract class provides a simple way to make conversions
 * into different measuring units
 */
public abstract class Converter
{
    public double factor;
    public String baseUnit;


    public Double toBase(double measurement)
    {
        return measurement * factor;
    }

    public Double fromBase(double measurement)
    {
        return measurement / factor;
    }
}