import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        int passingMarks = 50;
        int marksObt;
        Scanner sc = new Scanner(System.in);
        marksObt = sc.nextInt();

        if (marksObt < passingMarks){
            System.out.println("Sorry, try again!");
        }
        else {
            System.out.println("Hurray, you did it!");
        }
    }
}
