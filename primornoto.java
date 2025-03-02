import java.util.Scanner;
public class primornoto{
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        System.out.println("Enter the first integer number: ");
        int sta = sca.nextInt();
        System.out.println("Enter the second integer number: ");
        int end= sca.nextInt();
        if (sta>end) {
            int temp= sta;
            sta=end;
            end =temp;
        }
        boolean[] isPrime = new boolean[end + 1];
        for (int i = 0; i <= end; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int cou= 0;
        for (int k= sta; k<= end; k++) {
            if (isPrime[k]) {
                cou++;
            }
        }
        System.out.println("There are "+cou+" prime numbers between "+sta+" and " +end+".");
    }
}