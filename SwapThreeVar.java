import java.util.Scanner;

public class SwapThreeVar {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
