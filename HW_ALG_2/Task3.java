package pro.telran.de.homework.algorithms.HW_ALG_2;

public class Task3 {
    public static void completeTaskThree (){
        int n = 10;
        int a = 0;
        int i;
        int j;

        for (i = 0; i<n; i++){
            int count = 0;
            for (j=n; j>1; j--) {
                a = a + i + j;
                count++;
                System.out.println(count + " per");
            }
            }
        }

    }

