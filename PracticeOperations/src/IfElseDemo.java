public class IfElseDemo {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int testscore = 1 + rand.nextInt(100);
        char grade;

        if(testscore >= 90) grade = 'A';
        else if (testscore >= 80) grade = 'B';
        else if (testscore >= 70) grade = 'C';
        else if (testscore >= 60) grade = 'D';
        else grade = 'F';
        System.out.println(testscore);
        System.out.println(grade);
    }
}
