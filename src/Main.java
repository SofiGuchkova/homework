public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Andreas", "Black", 28);

person.setAge(21);
person.setName("Alex");
person.setFullName("Jackson");

person.move();
person.talk();
person1.move();
person1.talk();

// Задание 2

        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
     // Значение переменной phone + вывод через геттеры
        phone.getModel("Xiaomi");
        phone.getNumber(838383);
        phone.getWeight(10);
        // Значения переменной phone 1 + вывод через геттеры
        phone1.getModel("Iphone");
        phone1.getNumber(880055535);
        phone1.getWeight(12);
        // Значение переменной phone + вывод через геттеры
        phone2.getModel("Samsung");
        phone2.getNumber(313245);
        phone2.getWeight(9);

        // Вызов методов receiveCall и getNumber для каждого из переменных
        phone.receiveCall("Alex");
        phone.getPhoneNumber();
        phone1.receiveCall("George");
        phone1.getPhoneNumber();
        phone2.receiveCall("James");
        phone2.getPhoneNumber();




    }
}