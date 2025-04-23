import java.util.Scanner;
public class InPlaceArrayReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int leng= sc.nextInt();
        int[] array1 = new int[leng];
        System.out.println("Enter " + leng + " integers:");
        for (int i=0; i<leng; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0;i <leng/ 2;i++) {
            int temp=array1[i];
            array1[i] = array1[leng -1-i];
            array1[leng-1-i]= temp;
        }
        System.out.println("Reversed array:");
        for (int i=0; i< leng;i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
