package EXTEND;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃鱼 ");
    }
    public void meow() {
        System.out.println(name + " 喵喵喵! ");
    }
}
