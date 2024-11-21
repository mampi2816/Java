import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksObt;
        int passingMarks = 50;
        Scanner sc = new Scanner(System.in);

        marksObt = sc.nextInt();

        if (marksObt >= passingMarks){
            if (marksObt >= 90) {
                System.out.println("Well done! Grade A");
            }
            else if (marksObt >= 80 && marksObt < 90) {
                System.out.println("Good Job! Grade B");
            }
            else if (marksObt >= 70 && marksObt < 80) {
                System.out.println("Good but could be improved! Grade C");
            }
            else {
                System.out.println("Just Passed, need to improve! Grade D");
            }
        }
        else {
            System.out.println("Not Passed! Grade E");
        }
    }
    
}
