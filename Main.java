import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int addNum = rand.nextInt(1, 100);
        int addNum1 = rand.nextInt(1, 100);
        int addResult = addNum + addNum1;
        System.out.print("Решите пример: " + addNum + " + " + addNum1 + " = ");
        int scanNum = scan.nextInt();
        System.out.println("Ваш ответ: " + scanNum);
        System.out.println("Правильный ответ: " + addResult);

        while (scanNum != addResult) {
            addNum = rand.nextInt(1, 100);
            addNum1 = rand.nextInt(1, 100);
            addResult = addNum + addNum1;
            System.out.print("Решите пример: " + addNum + " + " + addNum1 + " = ");
            scanNum = scan.nextInt();
            System.out.println("Ваш ответ: " + scanNum);
            System.out.println("Правильный ответ: " + addResult);
        }
        System.out.println("Ура! Опросник завершён! Вы победили!");
    }
}
