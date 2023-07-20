import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    //создаем переменные типа "byte", типа "int", типа "double", типа "float"
    {
        byte Byte = 100;
        int Int = 96;
        double Double = 3.14;
        float Float = 2.718f;

        // более широкий тип к более узкому
        byte byteResult = (byte)Int;
        float floatResult = (float)Double;
        // более узкий тип к более широкому
        int intResult = (int)Byte;
        double doubleResult = (double)Float;

        System.out.println(byteResult);
        System.out.println(floatResult);
        System.out.println(intResult);
        System.out.println(doubleResult);

        // задание 2
            Scanner scanner = new Scanner(System.in);
            System.out.print("Хочу познакомиться. Как тебя зовут? Напиши здесь свое имя:");
            String name = scanner.nextLine();
            System.out.println("Привет," + name + "!");
    }
}