import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        String s;
        int n;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        n = s.length();
        List<String> subStrings = new ArrayList<>(); 

        for(int i=0; i<n; i++){
            for(int j =i+1; j<=n; j++){
                subStrings.add(s.substring(i, j));
            }
        }

        System.out.println(subStrings);
    }
}
