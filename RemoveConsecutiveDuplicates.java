import java.util.Scanner;
public class arrr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rs= sc.nextInt();
        int cs= sc.nextInt();
       int[][] array2D = new int[rs][cs];
        for (int i =0; i < r; i++) {
            for (int j = 0; j < cs; j++) {
                array2D[i] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < rs; i++) {
            for (int j = 0; j < cs; j++) {
                System.out.println(array2D[i][j] + " ");
            }
            System.out.println();
        }
        int[] array1D = new int[rs*cs];
        int cou= 0;
        for (int i = 0; i<rs; i++) {
            for (int j = 0; j<cs; j++) {
                array1D[cou++] = array2D[i][j];
            }
         System.out.println("1D Array:");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
    }
    }
}

