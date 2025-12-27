package OOP;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 80);
        Student s2 = new Student("Mary", 21, 70);
        Student s3 = new Student("Tom", 22, 95);
        Student s4 = new Student("Jane", 23, 85);
        Student s5 = new Student("Lily", 19, 65);

        Student [] student = {s1, s2, s3, s4, s5};
        for (int i = 0; i < student.length; i++) {
            student[i].showInfo();
        }
        double max = student[0].getScore();
        double min = student[0].getScore();
        for (int i = 0; i < student.length; i++) {
            if (student[i].getScore() > max) {
                max = student[i].getScore();
            }
            if (student[i].getScore() < min) {
                min = student[i].getScore();
            }
        }
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getScore() > student[maxIndex].getScore()){
                maxIndex = i;
            }
            if (student[i].getScore() < student[minIndex].getScore()){
                minIndex = i;
            }
        }
        System.out.println(" Max student: " );
        student[maxIndex].showInfo();
        System.out.println(" Min student: " );
        student[minIndex].showInfo();
        // 或者用增强 for（更简洁）
        // for (Student stu : students) {
        //     stu.showInfo();
        // }

        double sum = 0;
        for(Student stu : student){
            sum += stu.getScore();
        }
        double avg = sum / student.length;
        System.out.println("avg： " + avg);
    }
}
