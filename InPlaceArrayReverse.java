import java.util.Scanner;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements (m): ");
        int m= scanner.nextInt();
        int[] arr= new int[m];
        System.out.println("Enter " + m+ " integers:");
        for (int i = 0; i <m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequency of each number:");
        boolean[] visit= new boolean[m];
        for (int i = 0; i < m; i++) {
            if (visit[i]) 
             continue;
            int cou= 1;
            for (int j = i + 1; j < m; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    cou++;
                }
            }
            System.out.println(arr[i] + " appears " +cou+ " times");
        }
    }
}
