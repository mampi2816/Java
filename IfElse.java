import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        boolean coding;

        Scanner sc = new Scanner(System.in);

        coding = sc.nextBoolean();

        if(coding){
            System.out.println("Programmer");
        }
        else {
            System.out.println("Not a Programmer");
        }
    }
}
