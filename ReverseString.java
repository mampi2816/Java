import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s;
        String rev = "";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }

        System.out.println(rev);
    }
}
