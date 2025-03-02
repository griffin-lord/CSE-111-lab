import java.util.Scanner;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array (N): ");
        int N = scanner.nextInt();
        double[] originalArray = new double[N];
        System.out.println("Enter " + N + " double values:");
        for (int i = 0; i < N; i++) {
            originalArray[i] = scanner.nextDouble();
        }
        int countRemoved = 0;
        double[] tempArray = new double[N];
        int index = 0;
        if (N > 0) {
            tempArray[index++] = originalArray[0];
            for (int i = 1; i < N; i++) {
                if (originalArray[i] != originalArray[i - 1]) {
                    tempArray[index++] = originalArray[i];
                } else {
                    countRemoved++;
                }
            }
        }
        double[] newArray = new double[index];
        System.out.println("New Array " + countRemoved);
        System.out.println("Removed duplicates:"); {
            System.out.print(element + " ");
    }
    }
}
