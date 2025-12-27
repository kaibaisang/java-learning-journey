package EXTEND;

public class TextAnimal {
    public static void main(String[] args) {
        //多态：父类指向子类对象，调用子类的方法
        Animal a1 = new Dog("旺财", 3);
        Animal a2 = new Cat("花花", 2);

        a1.showInfo();
        a1.eat();//调用子类重写方法

        a2.showInfo();
        a2.eat();

        //向下转型让猫狗叫
        ((Dog)a1).bark();
        ((Cat)a2).meow();
    }
}
