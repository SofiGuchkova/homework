import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WorldState worldState = new WorldState(); NumChanges numChanges = new NumChanges();
        Scanner scanner = new Scanner(System.in);

//Вариант 1 = поменять местами значения
        System.out.print("Введите значение первого и второго чисел: ");
        numChanges.printOutNum(scanner.nextInt(), scanner.nextInt());

        //Вариант 2 = поменять местами значения
        numChanges.changeNum();



        // Задание 2 - про состояние мира, вызываем методы.
        worldState.isWorldNegativelyGood();
worldState.isWorldPositivelyGood();


    }
}