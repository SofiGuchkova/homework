public class Main {
    public static void main(String[] args) {

        // Объект класса Calculator
      Calculator calc = new Calculator() ;

      // Генерация рандомного числа с методом nextInt
        int addRandResult = calc.random();
        System.out.println("Генерация рандомного числе методом nextInt: " + addRandResult);

        // Вывод методов (результаты рандомных вычислений)
        calc.add(calc.random(), calc.random());
        calc.subtract(calc.random(), calc.random());
        calc.multipy(calc.random(), calc.random());
        calc.divide(calc.random(), calc.random());








    }
}