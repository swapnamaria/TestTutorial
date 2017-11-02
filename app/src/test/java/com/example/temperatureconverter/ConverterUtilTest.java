package com.example.temperatureconverter;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by mukraswa on 10/31/2017.
 */

public class ConverterUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float boilingPointFExpected = ConverterUtil.convertFahrenheitToCelsius(212);
        float boilingPointFActual = 100;
        assertEquals("Conversion from  Fahrenheit to Celsius failed", boilingPointFExpected, boilingPointFActual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        double CRoomTempExpected = ConverterUtil.convertCelsiusToFahrenheit(24);
        double FRoomTempExpected = 75.2;
        assertEquals("Conversion from Celsius to Fahrenheit failed", CRoomTempExpected, FRoomTempExpected, 0.001);
    }
}

