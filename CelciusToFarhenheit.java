import java.util.Scanner;

public class CelciusToFarhenheit {

    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextFloat();
        temp = (float) ((temp * 9/5) + 32);
        System.out.println(temp);
    }
}
