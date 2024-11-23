import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0){
            rev = rev * 10;
            rev = rev + n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
