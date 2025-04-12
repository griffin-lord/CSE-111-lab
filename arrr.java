import java.util.Scanner;

public class Flatten2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array2D = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        // Flatten the 2D array into a 1D array
        int[] array1D = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1D[index++] = array2D[i][j];
            }
        }

        // Print the 1D array
        System.out.println("Flattened 1D Array:");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
    }
}
