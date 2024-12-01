import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        rows = sc.nextInt();
        System.out.println("Enter cols:");
        columns = sc.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] res = new int[rows][columns];

        
        System.out.println("Enter matrix1");
        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix2");
        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


    }
}
