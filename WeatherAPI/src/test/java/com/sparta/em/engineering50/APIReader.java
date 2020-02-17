package com.sparta.em.engineering50;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class APIReader {
    private ObjectMapper objectMapper = new ObjectMapper();
    String baseUrl = "http://api.openweathermap.org/data/2.5/weather?q=";

    //api.openweathermap.org/data/2.5/weather?id={city id}&appid={your api key}

    public CurrentWeather readWeatherAPI(String extension) {
        CurrentWeather currentWeather = null;
        try (InputStream inputStream = new FileInputStream("src/test/resources/apiKey.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            currentWeather = objectMapper.readValue(new URL( baseUrl + extension + "&appid=" + properties.getProperty("key")), CurrentWeather.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentWeather;
    }
}