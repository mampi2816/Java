import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int a;
        float f;
        String s;


        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();
        System.out.println(s);

        a = sc.nextInt();
        System.out.println(a);

        f = sc.nextFloat();
        System.out.println(f);
    }
}
