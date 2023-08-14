
import java.util.Random;
import java.util.Scanner;

    public class MathQuiz {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Random random = new Random();

        String[] namesOfPlayers = new String[3];
        int[] scoreOfPlayers = new int[3];


        void start() {
            for (int i = 1; i < 4; i++){

                System.out.print("Введите имя игрока №" + i + ": ");
                String nameOfPlayer = scanner.nextLine();
                namesOfPlayers[i-1] = nameOfPlayer;
            }
            for (int counter = 1; counter < 7; counter++) {

                String[] operator = {" / ", " + ", " - ", " * "};
                int userResult;
                int rightResult;
                System.out.println(" ");
                System.out.println(" ");
for (int j = 1; j < 4; j++) {

    int val = random.nextInt(1, 20);
    int val1 = random.nextInt(1, 20);
    String operatorVar;
    operatorVar = operator[random.nextInt(operator.length)];
    if (operatorVar.equals(" + ")) {
        rightResult = calculator.add(val,val1);
    } else if (operatorVar.equals(" - ")) {
        rightResult = calculator.subtract(val,val1);
    } else if (operatorVar.equals(" * ")) {
        rightResult = calculator.multi(val,val1);
    } else {
        rightResult = calculator.divide(val,val1);
    }
    System.out.print(namesOfPlayers[j - 1] + ", решите " + counter + "-й пример: " + val + " " + operatorVar + " " + val1 + " = ");
    userResult = scanner.nextInt();
    if (userResult == rightResult) {
        scoreOfPlayers[j - 1] = scoreOfPlayers[j -1] + 5;
    } else {
        scoreOfPlayers[j - 1] = scoreOfPlayers[j-1] - 5;
    }
    System.out.print("Ответ игрока " + namesOfPlayers[j - 1] + ": " + userResult + ".");
    System.out.println(" Правильный ответ: " + rightResult);
}
                System.out.println(" ");
                System.out.println("Результаты игроков после " + counter + "-го вопроса: ");
for (int q = 1; q < 4; q++) {

                    System.out.print(" " + namesOfPlayers[q-1] + ": " + scoreOfPlayers[q-1] + " баллов.");
}
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Ура! Опросник завершён! финальный счёт: ");
            for (int i = 1; i < 4; i++) {
                System.out.println(namesOfPlayers[i - 1] + ": " + scoreOfPlayers[i - 1] + " баллов.");
            }
            }
        }