
import java.util.Random;
import java.util.Scanner;

    public class MathQuiz {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Random random = new Random();

        String[] namesOfPlayers = new String[5];
        int[] scoreOfPlayers = new int[5];


        void start() {
            int score;
            String name;
            for (int i = 1; i < 6; i++) {

                System.out.print("Введите имя игрока №" + i + ": ");
                String nameOfPlayer = scanner.nextLine();
                namesOfPlayers[i - 1] = nameOfPlayer;
            }
            for (int counter = 1; counter < 7; counter++) {

                String[] operator = {" / ", " + ", " - ", " * "};
                int userResult;
                int rightResult;
                System.out.println(" ");
                System.out.println(" ");
                for (int j = 1; j < 6; j++) {

                    int val = random.nextInt(1, 20);
                    int val1 = random.nextInt(1, 20);
                    String operatorVar;
                    operatorVar = operator[random.nextInt(operator.length)];
                    if (operatorVar.equals(" + ")) {
                        rightResult = calculator.add(val, val1);
                    } else if (operatorVar.equals(" - ")) {
                        rightResult = calculator.subtract(val, val1);
                    } else if (operatorVar.equals(" * ")) {
                        rightResult = calculator.multi(val, val1);
                    } else {
                        rightResult = calculator.divide(val, val1);
                    }
                    System.out.print(namesOfPlayers[j - 1] + ", решите " + counter + "-й пример: " + val + " " + operatorVar + " " + val1 + " = ");
                    userResult = scanner.nextInt();
                    if (userResult == rightResult) {
                        scoreOfPlayers[j - 1] = scoreOfPlayers[j - 1] + 5;
                    } else {
                        scoreOfPlayers[j - 1] = scoreOfPlayers[j - 1] - 5;
                    }
                    System.out.print("Ответ игрока " + namesOfPlayers[j - 1] + ": " + userResult + ".");
                    System.out.println(" Правильный ответ: " + rightResult);
                }
                System.out.println(" ");
                System.out.println("Результаты игроков после " + counter + "-го вопроса: ");
                for (int q = 1; q < 6; q++) {

                    System.out.print(" " + namesOfPlayers[q - 1] + ": " + scoreOfPlayers[q - 1] + " баллов.");
                }
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Ура! Опросник завершён! финальный счёт: ");
            for (int x = 1; x < scoreOfPlayers.length; x++) {
                for (int j = 1; j < scoreOfPlayers.length; j++) {
                    score = scoreOfPlayers[j];
                    name = namesOfPlayers[j];
                    if (scoreOfPlayers[j] > scoreOfPlayers[j - 1]) {
                        scoreOfPlayers[j] = scoreOfPlayers[j - 1];
                        namesOfPlayers[j] = namesOfPlayers[j - 1];
                        scoreOfPlayers[j - 1] = score;
                        namesOfPlayers[j - 1] = name;
                    }
                }
            }
            for (int i = 1; i < 6; i++) {
                System.out.println(i + " место: " + namesOfPlayers[i - 1] + " c результатом: " + scoreOfPlayers[i - 1] + " баллов.");
            }
            SearchTheName();
        }
            void SearchTheName(){
            int findScore;
            int minVal = 0;
            int maxVal = scoreOfPlayers.length - 1;
            int middleVal;
            System.out.print(" Введите количество очков, чтобы узнать какой из игроков их набрал: ");
            findScore = scanner.nextInt();

            while (minVal <= maxVal) {
                middleVal = minVal+(maxVal - minVal)/2;

                if (findScore == scoreOfPlayers[middleVal]) {
                        System.out.println("Игрок, набравший " + findScore + " баллов: " + namesOfPlayers[middleVal]);
                        return;
                }
                if (findScore < scoreOfPlayers[middleVal]) {
                    minVal = middleVal + 1;
                } if (findScore > scoreOfPlayers[middleVal]) {
                    maxVal = middleVal - 1;
                }
                }
            }

        }

