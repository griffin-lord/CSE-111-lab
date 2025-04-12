import java.util.Scanner;
public class arraysssi{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int [] arra1= new int[n];
    for(int j=0;j<n;j++){
    arra1[j]=sc.nextInt();
    }
    for (int i=0;i<n;i++){
      if (arra1[i]== n){
      System.out.println(n);
    }
   }
  }
}