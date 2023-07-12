package com.weatherconditions;

public class WeatherConditions {
    public String SnowWeather = "Снег";
    public String Cold = "Холодно";
    public String cool = "Прохладно";
    public String warm = "Тепло";
    public String hot = "Жарко";
   public String[] WeatherCondition = new String[]{"Гроза", "Солнце", "Облачно", "Дождь"};
    public int cond1 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond2 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond3 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond4 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond5 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond6 = (int) Math.floor(Math.random() * WeatherCondition.length);
    public int cond7 = (int) Math.floor(Math.random() * WeatherCondition.length);




}
