public class NumChanges {

    //Вариант 1 = поменять местами значения
    void printOutNum(int x, int x1) {
        System.out.println("Значение первого числа: " + x1);
        System.out.println("Значение второго числа: " + x);
        System.out.println("");
    }

    // Вариант 2 = поменять местами значения
    void changeNum() {
        int a = 10;
        int b = 20;
        System.out.println("Значение до замены переменной a: " + a + " Значение до замены переменной b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение после замены значения переменной a: " + a + " Значение после замены значения переменной b: " + b);
        System.out.println("");

    }


}
