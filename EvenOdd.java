import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        if(m % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
