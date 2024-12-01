import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        n = sc.nextInt();
        int original = n;

        while (n != 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }

        System.out.println(rev);

        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
