import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            if(n!=0){
                System.out.println(n);
                continue;
            }else{
                break;
            }
        }
    }
}
