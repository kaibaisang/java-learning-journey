package NEW;

public class VariableDemo {
    public static void main(String[] args) {
        //1.整型类型
        int age = 25;
        long population = 1000000000L;//long类型要加 L

        //2.浮点型类型
        double salary = 50000.5;
        double pi = 3.14159;
        float height = 1.75f;//float类型要加 f

        //3.字符型类型
        char gender = 'M';
        String name ="kaibaisang";//String类型需要用双引号
        String hobby = "学习Java";

        //4.布尔型类型
        boolean isStudent = true;

        //输出
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);
        System.out.println("isn't it a student? " + isStudent);
        System.out.println("My hobby is " + hobby + " and my name is " + name);

        //基本运算
        int a = 10;
        int b = 5;
        int c = 15;
        double d = 2.0;
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));
        System.out.println("c/d=" + (c/d));
    }
}
