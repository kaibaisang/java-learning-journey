package NEW;

public class ArrayDemo {
    public static void main(String[] args) {
        //方式1：声明 + 动态创建
        int[] scores = new int[5];//长度为5的数组，元素默认值是0

        //赋值 （索引从0开始）
        scores[0] = 88;
        scores[1] = 92;
        scores[2] = 76;
        scores[3] = 95;
        scores[4] = 67;

        //方式2：直接初始化
        int []nums = {10, 20, 30, 40, 50};


        String[] hobbies = {"游戏","阅读","编程","健身","旅游"};

        //打印数组长度
        System.out.println("成绩数组长度：" + scores.length);
        System.out.println("爱好数组长度：" + hobbies.length);
        System.out.println();

        //普通for遍历数组
        System.out.print("成绩列表：");
        for (int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //找最大最小值
        int []numbers = new int[]{12, 45, 23, 89, 67, 34, 91, 56};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
        }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println();

        //增强遍历（推荐用于只读）
        System.out.print("我的爱好有：");
        for (String hobby : hobbies){
            System.out.print(hobby + " ");
        }
        System.out.println();

        double prices[] ={99.5, 88.0, 129.9, 45.6, 200.0};
        System.out.println("商品的总价：");
        double sum1 = 0.0;
        for(double p : prices){
            sum1 += p;
        }
        System.out.println("商品的总价为：" + sum1);
        System.out.println();

        //计算成绩总和、平均分、最高分、最低分
        int sum = 0;
        int max1 = scores[0];
        int min1 = scores[0];

        for (int s : scores){
            sum += s;
            if (s > max1)
                max1 = s;
            if (s < min1)
                min1 = s;
        }
        double avg = (double)sum / scores.length;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + avg);
        System.out.println("最高分：" + max1);
        System.out.println("最低分：" + min1);
        System.out.println();

        //二维数组简单演示
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("二维数组[1][2]：" + matrix[1][2]);

        //生成数组1-10并倒序打印
        System.out.println("生成数组1-10并倒序打印：");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i]=i+1;
        }
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
