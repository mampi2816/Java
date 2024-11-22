import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        if(s1.compareTo(s2)>0){
            System.out.println(s1 + " is greater string");
        }
        else if(s2.compareTo(s1)>0){
            System.out.println(s2 + " is greater string");
        }
        else{
            System.out.println("both strings are equal");
        }
    }
}
