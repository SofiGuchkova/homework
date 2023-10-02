public class Person {
    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String fullName;
    private int age;
    Person() {

    }
    Person (String name, String fullName, int age) {
        this.name=name;
        this.fullName=fullName;
        this.age=age;
    }
    public void move(){
        System.out.println(fullName + " идёт.");
    }
    public void talk(){
        System.out.println(fullName + " говорит.");

    }

}
