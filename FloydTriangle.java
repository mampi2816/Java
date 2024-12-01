import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int rows;
        int num = 1;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
