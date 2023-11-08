package pro.telran.de.homework.algorithms.HW_ALG_2;

public class HW_ALG_2 {

        public static void main(String[] args) {

            // Первое задание
            //    public static task #1
            // START
            // READ number n
            // IF n == 1 THEN return
            // FOR i = 1, i <= n, i + 1
            // FOR j = 1; j <= n, j + 1
            // print "*"
            // BREAK
            // END

            Task1 task1 = new Task1();
            task1.completeTaskOne();
            // Здесь 2 цикла, каждый из которых выполняется n раз.
            // Так как они вложенные, то print сработает n*n раз.
            // сложность получается О(n^2)

            //task #2
            // START
            // READ number n
            // numbers i = 0, j = 0, a = 0
            // FOR i = n/2, i <= n; i + 1
            // FOR j = 2, j <= n, j * 2
            // a = a + n / 2
            // END

            Task2 task2 = new Task2 ();
            task2.completeTaskTwo();

            /*
            Во внутреннем цикле log(2)n итераций
            Во внешнем цикле (n/2 + 1) итераций
            Сложность - O(n/2 + 1)*log(2)n
            */


            //task #3
            // START
            // READ number n
            // number a = 0
            // FOR i = 0, i < n, i + 1
            // FOR j = n, j > i, j - 1
            // a = a + i + j
            // END

            Task3 task3 = new Task3();
            task3.completeTaskThree();

            // Внутренний цикл выполняется (n-1) раз
            // Внешний цикл выполняется n раз
            // O(n(n-1) - сложность алогритма


            //task #4
            // START
            // READ number n
            // numbers a = 0, i = n
            // WHILE i > 0
            // a = a + i
            // i = i / 2

            Task4 task4 = new Task4();
            task4.completeTaskFour();

            // цикл будет выполнятся log(2)n раз
            // Сложность O(log(2)n)
        }

    }



