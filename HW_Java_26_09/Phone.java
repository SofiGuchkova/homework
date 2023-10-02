import java.util.Random;

public class Phone {
    Random random = new Random();


    private int number;
    private String model;
    private int weight;
    public int getNumber(int number) {

        System.out.println("Номер телефона: " + number);
        return number;
    }

    public String getModel(String model) {
        System.out.println("Модель телефона: " + model);
        return model;
    }

    public int getWeight(int weight) {
        System.out.println("Вес модели - " + weight + " грамм.");
        return weight;
    }

    // Метод receiveCall

    public void receiveCall(String name){

        System.out.println("Звонит " + name);
    }
    //Метод getNumber
    public int getPhoneNumber() {
        int phoneNumber = random.nextInt(12345678,987654321);
        System.out.println(phoneNumber);
        return phoneNumber;
    }

}
