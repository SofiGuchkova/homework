package WeatherForecast;

public class WeatherForecastResult {
    public static void main(String[] args) {
        // Создаю объекты для каждого дня недели с конкретной температурой
        WeatherEveryDay monday = new WeatherEveryDay(WeekDays.MONDAY, new Temperature(25), new WeatherConditions("Солнечно"));
        WeatherEveryDay tuesday = new WeatherEveryDay(WeekDays.TUESDAY, new Temperature(22), new WeatherConditions("Облачно"));
        WeatherEveryDay wednesday = new WeatherEveryDay(WeekDays.WEDNESDAY, new Temperature(20), new WeatherConditions("Дождь"));
        WeatherEveryDay thursday = new WeatherEveryDay(WeekDays.THURSDAY, new Temperature(18), new WeatherConditions("Пасмурно"));
        WeatherEveryDay friday = new WeatherEveryDay(WeekDays.FRIDAY, new Temperature(23), new WeatherConditions("Солнечно"));
        WeatherEveryDay saturday = new WeatherEveryDay(WeekDays.SATURDAY, new Temperature(26), new WeatherConditions("Солнечно"));
        WeatherEveryDay sunday = new WeatherEveryDay(WeekDays.SUNDAY, new Temperature(24), new WeatherConditions("Переменная облачность"));

        // Вывожу результат прогноза погоды для каждого дня отдельно
        System.out.println("Прогноз погоды на каждый день:");
        System.out.println("Понедельник: " + monday.conditions.condition + ", " + monday.temperature.temperatureValue + "°C");
        System.out.println("Вторник: " + tuesday.conditions.condition + ", " + tuesday.temperature.temperatureValue + "°C");
        System.out.println("Среда: " + wednesday.conditions.condition + ", " + wednesday.temperature.temperatureValue + "°C");
        System.out.println("Четверг: " + thursday.conditions.condition + ", " + thursday.temperature.temperatureValue + "°C");
        System.out.println("Пятница: " + friday.conditions.condition + ", " + friday.temperature.temperatureValue + "°C");
        System.out.println("Суббота: " + saturday.conditions.condition + ", " + saturday.temperature.temperatureValue + "°C");
        System.out.println("Воскресенье: " + sunday.conditions.condition + ", " + sunday.temperature.temperatureValue + "°C");
    }
}
