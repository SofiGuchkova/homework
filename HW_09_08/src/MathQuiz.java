
import java.util.Random;
import java.util.Scanner;

    public class MathQuiz {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Random random = new Random();

        void start() {

            System.out.print("Введите количество вопросов: ");
            int numbOfQuestions = scanner.nextInt();
            System.out.print("Введите количество игроков: ");
                    int numbOfPlayers = scanner.nextInt();

            String[] namesOfPlayers = new String[numbOfPlayers];
            int[] scoreOfPlayers = new int[namesOfPlayers.length];
            int score;
            String name;
            for (int i = 1; i < namesOfPlayers.length + 1; i++) {
                System.out.print("Введите имя игрока №" + i + ": ");
                String nameOfPlayer = scanner.next();
                namesOfPlayers[i-1] = nameOfPlayer;
            }
            for (int counter = 1; counter <= numbOfQuestions; counter++) {

                String[] operator = {" / ", " + ", " - ", " * "};
                int userResult;
                int rightResult;
                System.out.println(" ");
                System.out.println(" ");
                for (int j = 1; j < namesOfPlayers.length + 1; j++) {

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
                for (int q = 1; q < namesOfPlayers.length + 1; q++) {

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
            for (int i = 1; i < scoreOfPlayers.length + 1; i++) {
                System.out.println(i + " место: " + namesOfPlayers[i - 1] + " c результатом: " + scoreOfPlayers[i - 1] + " баллов.");
            }

            SearchTheName(scoreOfPlayers, namesOfPlayers);
        }
            void SearchTheName(int[] arrayNumb, String[] arrayName){
                int findScore;
            int minVal = 0;
            int maxVal = arrayNumb.length - 1;
            int middleVal;
            System.out.print(" Введите количество очков, чтобы узнать какой из игроков их набрал: ");
            findScore = scanner.nextInt();

            while (minVal <= maxVal) {
                middleVal = minVal+(maxVal - minVal)/2;

                if (findScore == arrayNumb[middleVal]) {
                        System.out.println("Игрок, набравший " + findScore + " баллов: " + arrayName[middleVal]);
                        return;
                }
                if (findScore < arrayNumb[middleVal]) {
                    minVal = middleVal + 1;
                } if (findScore > arrayNumb[middleVal]) {
                    maxVal = middleVal - 1;
                }
                else {
                    System.out.println(" Ни один из игроков не набрал такое количество баллов. ");
                }
                }
            }

        }

