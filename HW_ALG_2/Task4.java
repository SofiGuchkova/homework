package pro.telran.de.homework.algorithms.HW_ALG_2;

public class Task4 {
    public void completeTaskFour(){
        int n = 130;
        int a = 0;
        int i = n;
        int count = 0;
        while(i>0){
            a = a + i;
            i = i/2;
            count++;
            System.out.println(count);
        }
    }
}
