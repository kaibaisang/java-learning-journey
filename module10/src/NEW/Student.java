package NEW;

public class Student {
    //成员变量(字段)
    String name;
    int age;
    double score;

    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        Student s2 = new Student();

        //赋值
        s1.name = "baikaisang";
        s1.age = 25;
        s1.score = 95.5;

        System.out.println("姓名: " + s1.name);
        System.out.println("年龄: " + s1.age);
        System.out.println("分数: " + s1.score);

        s2.name = "zhangsan";
        s2.age = 20;
        s2.score = 85.5;

        System.out.println("姓名: " + s2.name);
        System.out.println("年龄: " + s2.age);
        System.out.println("分数: " + s2.score);
    }
}
