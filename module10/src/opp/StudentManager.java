package opp;

import java.util.Scanner;
public class StudentManager {
    private static final int MAX_SIZE = 10;// 最多容纳10个学生
    private static Student[] students = new Student[MAX_SIZE];
    private static int count = 0;// 当前实际学生数量
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //先放几个测试数据
        addTestData();

        while (true){
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();//消耗换行符

            switch (choice){
                case 1:
                    showAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    updateScore();
                    break;
                case 6:
                    System.out.println("谢谢使用，再见！");
                    return;//退出程序
                default:
                    System.out.println("输入错误，请重新输入！");
            }
            System.out.println("\n按回车继续");
            sc.nextLine();
        }
    }

    private static void showMenu(){
        System.out.println("\n========学生管理系统========");
        System.out.println("1.显示所有学生");
        System.out.println("2.添加学生");
        System.out.println("3.根据姓名查找学生");
        System.out.println("4.根据姓名删除学生");
        System.out.println("5.修改学生分数");
        System.out.println("6.退出系统");
        System.out.print("请作出你的选择:");
    }
    private static void addTestData(){
        students[0] = new Student("John", 20, 80);
        students[1] = new Student("Mary", 21, 70);
        students[2] = new Student("Tom", 22, 95);
        students[3] = new Student("Jane", 23, 85);
        students[4] = new Student("Lily", 19, 65);
        count = 5;
    }
    //下面这些方法我们逐步实现
    private static void showAllStudents(){
        System.out.println("\n=== 所有学生信息 ===");
        // 你的作业：遍历 students[0] 到 students[count-1]，调用 showInfo()
        if (count == 0){
            System.out.println("暂无学生信息！");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].showInfo();
        }
    }
    private static void addStudent(){
        System.out.println("\n=== 添加学生 ===");
        // 作业：输入姓名、年龄、分数，创建新 Student，放到 students[count]，count++
        // 注意判断是否已满（count >= MAX_SIZE）
        if (count >= MAX_SIZE) {
            System.out.println("学生数量已满，不能再添加！");
        }else {
            System.out.print("请输入姓名：");
            String name = sc.nextLine();
            System.out.print("请输入年龄：");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("请输入分数：");
            double score = sc.nextDouble(); //注意这里用 nextDouble()
            sc.nextLine();
            students[count] = new Student(name, age, score);
            count++;
            System.out.println("添加成功！");
        }
    }
    private static void searchStudent(){
        System.out.println("\n=== 查找学生 ===");
        // 作业：输入姓名，遍历查找，找到就 showInfo()，没找到提示“未找到”
        System.out.print("请输入要查找的姓名：");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)) {
                students[i].showInfo();
                found = true;
                //如果只想找第一个直接break;
                //允许多个重名就继续遍历
            }
        }
        if (!found){
            System.out.println("未找到该学生！");
        }
    }
    private static void deleteStudent(){
        System.out.println("\n=== 删除学生 ===");
        // 作业：输入姓名，找到后删除（把后面的元素前移），count--
        System.out.print("请输入要删除的姓名：");
        String name = sc.nextLine();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)) {
                index = i;
                break;//找到第一个就停下
            }
        }
        if(index != -1){
            for (int j = index; j < count-1; j++) {
                students[j] = students[j+1];
            }
            count--;
            System.out.println("删除成功！");
        }else {
            System.out.println("未找到该学生,无法删除！");
        }
    }
    private static void updateScore(){
        System.out.println("\n=== 修改学生分数 ===");
        // 作业：输入姓名，找到后输入新分数，更新 score
        System.out.print("请输入要修改的姓名：");
        String name = sc.nextLine();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.print("请输入新分数：");
            double score = sc.nextDouble();
            sc.nextLine();
            students[index].setScore(score);
            System.out.println("修改成功！");
        }else {
            System.out.println("未找到该学生,无法修改!");
        }

    }
}
