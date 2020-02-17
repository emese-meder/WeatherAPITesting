package com.sparta.em.engineering50;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class TestCurrentWeather {

    APIReader apiReader = new APIReader();

    //Read existing JSON and XML student files into objects
    CurrentWeather json =  apiReader.readWeatherAPI("London");

    @Test
    public void testBaseIsString() {
        assertEquals( String.class , json.getBase().getClass());
    }

    @Test
    public void testVisibilityIsInt(){
    }

    @Test
    public void testDtIsInt(){
        assertEquals(Integer.class, Integer.valueOf(json.getDt()).getClass());
    }






}
