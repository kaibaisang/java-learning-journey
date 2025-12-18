package NEW;

public class ControlFlowDemo {
    public static void main(String[] args) {
        // 1.if年龄判断
        int age = 25;
        if (age <= 18) {
            System.out.println("未成年");
        } else if (age <35) {
            System.out.println("青年");
        }else {
            System.out.println("中年及以上");
        }
        System.out.println();

        //添加项 if 判断成绩
        int score = 85;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score>=80 && score<90) {
            System.out.println("良好");
        } else if (score>=60 && score<80) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        System.out.println();

        // 2.switch 判断成绩等级
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("中等");
                break;
            default:
                System.out.println("需努力");
        }
        System.out.println();

        //3. for 循环打印 1-10
        System.out.println("1-10:");
        for (int i= 1; i<=10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //4. while 循环求和
        int sum = 0;
        int num = 1;
        while (num <= 100){
            sum += num;
            num++;
        }
        System.out.println("1-100的和为：" + sum);
        System.out.println();


        //添加项 for 循环打印 10到1 的倒计时
        for (int i=10; i>=1; i--){
            System.out.println(i + "秒" + "\t");
        }
        System.out.println();

        //5. for 循环打印九九乘法表（部分）
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
        }
        System.out.println();

        //用 while 循环计算 1+3+5+...+99 的奇数和
        int oddSum = 0;
        int num2 = 1;
        while (num2 <= 99){
            oddSum += num2;
            num2 += 2;// 直接跳到下一个奇数
        }
        System.out.println("1+3+5+...+99的奇数和为：" + oddSum);
        System.out.println();
    }
}
