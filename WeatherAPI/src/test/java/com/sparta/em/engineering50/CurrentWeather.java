package com.sparta.em.engineering50;

import java.util.HashMap;

public class CurrentWeather {

    private HashMap<String, Float> coord;
    private Weather[] weather;
    private String base;
    private HashMap<String, Float> main;
    private int visibility;
    private HashMap<String, Float> wind;
    private HashMap<String, Integer>clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    public CurrentWeather(){}


    public HashMap<String, Float> getCoord() {
        return coord;
    }

    public void setCoord(HashMap<String, Float> coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public HashMap<String, Float> getMain() {
        return main;
    }

    public void setMain(HashMap<String, Float> main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public HashMap<String, Float> getWind() {
        return wind;
    }

    public void setWind(HashMap<String, Float> wind) {
        this.wind = wind;
    }

    public HashMap<String, Integer> getClouds() {
        return clouds;
    }

    public void setClouds(HashMap<String, Integer> clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
