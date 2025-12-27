package NEW;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
