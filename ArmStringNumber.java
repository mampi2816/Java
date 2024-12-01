import java.util.Scanner;

public class ArmStringNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    
    }

    public static boolean isArmstrong(int n){
        int originalNo = n;
        int sum = 0;
        int m = 0;
        int res = String.valueOf(n).length();

        while(n>0){
            m = n%10;
            sum += Math.pow(m, res);
            n = n/10;
        }

        return sum == originalNo;
    }
}
