import java.util.Random;

public class Calculator {


    // Так как при сложении, например, двух рандомных чисел максимальной вместимости типа int,
    // результат будет выдавать ошибочное значение, то взяла метод типа лонг, чтобы возвращаемое/выводимое
    // значение всегда было правильным(часть 3 Д/З). Аналогично для умножения и вычитания.

    // Метод суммы с двумя аргументами.
    long add(int add, int add1) {
        long addResult = (long)add + (long)add1;
        System.out.println("Результат суммы случайных чисел: " + addResult);
        return addResult;
    }

    // Метод вычитания с двумя аргументами
    long subtract(int sub, int sub1) {
        long subResult = (long)sub - (long)sub1;
        System.out.println("Результат вычитания случайных чисел: " + subResult);
        return subResult;
    }

    // Метод умножения с двумя аргументами

    long multipy(int mult, int mult1) {
        long multResult = (long)mult * (long)mult1;
        System.out.println("Результат умножения случайных чисел: " + multResult);
        return multResult;
    }

    // Метод деления с двумя аргументами. Так как при делении int-ов может быть
    // число с плавающей точкой, задала метод double, чтобы всегда возвращалось/выводилось правильное значение
    double divide(int div, int div1) {
        double divResult = (double)div / (double)div1;
        System.out.println("Результат деления случайных чисел: " + divResult);
        return divResult;
    }

    int random() {
        Random resRand = new Random();
        return resRand.nextInt();
    }

}
