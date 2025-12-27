package NEW;

public class Student {
    //成员变量(字段)
    private String name;
    private int age;
    private double score;

    //添加 public 的 getter 和 setter 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    //添加构造方法
    // 无参构造（IDEA 自动有，但我们可以显式写）
    //带参构造（可以直接赋值）
    public Student() {
        //空构造什么都不写
    }
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //添加普通方法: 显示学生信息
    public void ShowInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("分数: " + score);
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        //方法1: 无构造 + setter
        Student s1 = new Student();
        s1.setName("baikaisang");
        s1.setAge(25);
        s1.setScore(95.5);
        s1.ShowInfo();

        //带参数构造
        Student s2 = new Student("lisi", 20, 85.5);
        s2.ShowInfo();
        //创建对象
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        //赋值
//        s1.name = "baikaisang";
//        s1.age = 25;
//        s1.score = 95.5;
//
//        System.out.println("姓名: " + s1.name);
//        System.out.println("年龄: " + s1.age);
//        System.out.println("分数: " + s1.score);
//
//        s2.name = "zhangsan";
//        s2.age = 20;
//        s2.score = 85.5;
//
//        System.out.println("姓名: " + s2.name);
//        System.out.println("年龄: " + s2.age);
//        System.out.println("分数: " + s2.score);
    }
}
