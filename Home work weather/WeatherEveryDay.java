package WeatherForecast;
public class WeatherEveryDay {
    public WeekDays day; // День недели
    public Temperature temperature; // Температура
    public WeatherConditions conditions; // Состояние погоды

    public WeatherEveryDay(WeekDays day, Temperature temperature, WeatherConditions conditions) {
        // Конструктор класса с днями неделями, температурой и состоянием погодой
        this.day = day;
        this.temperature = temperature;
        this.conditions = conditions;
    }
}
