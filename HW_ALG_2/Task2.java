package pro.telran.de.homework.algorithms.HW_ALG_2;

public class Task2 {

    public void completeTaskTwo() {
        int n = 32;
        int i;
        int j;
        i = 0;
        j = 0;
        int a = 0;
        int count = 0;
        for (i = n/2; i <= n; i++) {
            for (j = 2; j <= n; j=j*2) {
                a = a + i + j;
                count ++;
                System.out.println(count);

            }
        }
    }
}