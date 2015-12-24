package com.mobiledev.tkadima.simpleconverter;

import com.mobiledev.tkadima.simpleconverter.converters.WeightConverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ConverterUnitTest {
    // Weight converters
    WeightConverter poundConverter = new WeightConverter("lbs");
    WeightConverter ozConverter = new WeightConverter("ounce");
    WeightConverter stoneConverter = new WeightConverter("stone");
    WeightConverter kiloConverter = new WeightConverter("kilograms");
    WeightConverter gramsConverter = new WeightConverter("grams");

    @Test
    public void weightConversionsTest() throws Exception {

        assertEquals(Double.valueOf(4.54), poundConverter.toBase(10));
        assertEquals(Double.valueOf(0.28), ozConverter.toBase(10));
        assertEquals(Double.valueOf(63.5), stoneConverter.toBase(10));
        assertEquals(Double.valueOf(10), kiloConverter.toBase(10));
        assertEquals(Double.valueOf(.01), gramsConverter.toBase(10));

//        assertEquals(22.04, poundConverter.fromBase(10));
//        assertEquals(352.74, ozConverter.fromBase(10));
//        assertEquals(1.57, stoneConverter.fromBase(10));
//        assertEquals(10, kiloConverter.fromBase(10));
//        assertEquals(1000, gramsConverter.fromBase(10));
    }
}