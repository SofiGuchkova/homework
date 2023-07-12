import com.daysoftheweek.DaysoftheWeek;
import com.temrature.Temp;
import com.weatherconditions.WeatherConditions;

public class Main {
    public static void main(String[] args) {

DaysoftheWeek Days = new DaysoftheWeek();

WeatherConditions Conditions = new WeatherConditions();

Temp Temprature = new Temp();

        // Понедельник

        //Случайный выбор температуры от 0 до 35 градусов.

        int r1 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Monday);
        System.out.println(r1 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r1 == 0) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
            }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r1 > 0 && r1 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r1 >= Temprature.ColdWeather && r1 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r1 >= Temprature.CoolWeather && r1 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r1 >= Temprature.GoodWeather && r1 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond1]);
            System.out.println(" ");
            }




        //Вторник

        //Случайный выбор температуры от 0 до 35 градусов.

        int r2 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Tuesday);
        System.out.println(r2 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r2 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r2 > 0 && r2 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond2]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r2 >= Temprature.ColdWeather && r2 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond2]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r2 >= Temprature.CoolWeather && r2 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond2]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).


        else if (r2 >= Temprature.GoodWeather && r2 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond2]);
            System.out.println(" ");
        }

        //Среда
        //Случайный выбор температуры от 0 до 35 градусов.

        int r3 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Wednesday);
        System.out.println(r3 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r3 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r3 > 0 && r3 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond3]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r3 >= Temprature.ColdWeather && r3 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond3]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r3 >= Temprature.CoolWeather && r3 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond3]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r3 >= Temprature.GoodWeather && r3 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond3]);
            System.out.println(" ");
        }

        //Четверг
        //Случайный выбор температуры от 0 до 35 градусов.

        int r4 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Thursday);
        System.out.println(r4 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r4 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r4 > 0 && r4 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond4]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r4 >= Temprature.ColdWeather && r4 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond4]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r4 >= Temprature.CoolWeather && r4 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond4]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r4 >= Temprature.GoodWeather && r4 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond4]);
            System.out.println(" ");
        }

        //Пятница
        //Случайный выбор температуры от 0 до 35 градусов.

        int r5 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Friday);
        System.out.println(r5 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r5 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r5 > 0 && r5 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond5]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r5 >= Temprature.ColdWeather && r5 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond5]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r5 >= Temprature.CoolWeather && r5 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond5]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r5 >= Temprature.GoodWeather && r5 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond5]);
            System.out.println(" ");
        }

        //Суббота
        //Случайный выбор температуры от 0 до 35 градусов.

        int r6 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Saturday);
        System.out.println(r6 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r6 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r6 > 0 && r6 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond6]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r6 >= Temprature.ColdWeather && r6 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond6]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r6 >= Temprature.CoolWeather && r6 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond6]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r6 >= Temprature.GoodWeather && r6 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond6]);
            System.out.println(" ");
        }

        //Воскресенье
        //Случайный выбор температуры от 0 до 35 градусов.

        int r7 = (int) (Math.random() * Temprature.HotWeather);

        //Вывод дня недели и значения температуры

        System.out.println(Days.Sunday);
        System.out.println(r7 + "°C");

        //Условие и вывод, при котором всегда идет снег и холодная погода.

        if (r7 == 0){
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.SnowWeather);
            System.out.println(" ");
        }

        //Условие, при котором холодная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r7 > 0 && r7 < Temprature.ColdWeather) {
            System.out.println(Conditions.Cold);
            System.out.println(Conditions.WeatherCondition[Conditions.cond7]);
            System.out.println(" ");
        }

        //Условие, при котором прохладная погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r7 >= Temprature.ColdWeather && r7 < Temprature.CoolWeather) {
            System.out.println(Conditions.cool);
            System.out.println(Conditions.WeatherCondition[Conditions.cond7]);
            System.out.println(" ");
        }

        //Условие, при котором теплая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r7 >= Temprature.CoolWeather && r7 < Temprature.GoodWeather) {
            System.out.println(Conditions.warm);
            System.out.println(Conditions.WeatherCondition[Conditions.cond7]);
            System.out.println(" ");
        }

        //Условие, при котором жаркая погода и ее вывод + вывод случайного состояния погоды (кроме снега).

        else if (r7 >= Temprature.GoodWeather && r7 <= Temprature.HotWeather) {
            System.out.println(Conditions.hot);
            System.out.println(Conditions.WeatherCondition[Conditions.cond7]);
            System.out.println(" ");
        }
    }
    }
