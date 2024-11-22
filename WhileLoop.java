import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==0){
            System.out.println("0");
        }
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}
