package com.sparta.em.engineering50;

/**
 * Hello world!
 *
 */
public class App 
{
    {
        APIReader apiReader = new APIReader();

        //Read existing JSON and XML student files into objects
        CurrentWeather currentWeatherAsJson = apiReader.readWeatherAPI("");

        //Check that the student have been read correctly
        System.out.println(currentWeatherAsJson);
    }
}
