
import java.util.Random;
import java.util.Scanner;

    public class MathQuiz {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Random random = new Random();
        int score = 0;




        void start() {
            for (int counter = 1; counter < 7; counter++) {
                int val = random.nextInt(1, 20);
                int val1 = random.nextInt(1, 20);
                String operator;
                int userResult;
                int rightResult;
                if (random.nextBoolean() && random.nextBoolean()) {
                    operator = " + ";
                    rightResult = calculator.add(val,val1);

                } else if (random.nextBoolean() && random.nextBoolean()) {
                    operator = " - ";
                    rightResult = calculator.subtract(val,val1);
                } else if (random.nextBoolean() && random.nextBoolean()) {
                    operator = " * ";
                    rightResult = calculator.multi(val,val1);
                } else {
                    operator = " / ";
                rightResult = calculator.divide(val,val1);
                }
                System.out.print("Вопрос " + counter + ": " + "Сколько будет " + val + " " + operator + " " + val1 + " = ");
                userResult = scanner.nextInt();
                if (userResult == rightResult) {
                    score = score + 5;
                    System.out.println("Ваш ответ: " + userResult + ". " + "Правильный ответ: " + rightResult + ". " + "Текущее количество баллов: " + score + " баллов.");
                } else {
                    score = score - 5;
                    System.out.println("Ваш ответ: " + userResult + ". " + "Правильный ответ: " + rightResult + ". " + "Текущее количество баллов: " + score + " баллов.");
                }

                }
            System.out.println("Ура! Опросник завершён! Вы победили! Ваш финальный счёт: " + score);
            }
        }