import java.util.Scanner;
import java.util.Arrays;
public class A1T9{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int [][]A=new int[N][N];
    int sum1=0;
    int sum2=0;
    for (int i=0; i<A.length; i++){
      for (int j=0;j<A.length; j++){
        A[i][j]=sc.nextInt();
      }
    }
   
    for (int i=0; i<A.length; i++){
     for (int j=0;j<A.length; j++){
       System.out.print(A[i][j]+" ");
     }
     System.out.println();
    }
    System.out.println();
   
   
   
    for(int i=0; i<A.length; i++) {
      for (int j=0; j<A.length; j++){
        if(i==j){
          sum1+=A[i][j];
        }
      }
    }
   
      if (sum1==N){
        for(int i=0; i<A.length; i++) {
      for (int j=0; j<A.length; j++){
        if(i!=j){
          sum2+=A[i][j];
        }
      }
        }
        if(sum2==0){
          System.out.println("Identity Matrix");
        }
        else {
         System.out.println("Not an Identity Matrix");
        }  
      }
       
       
  }
  }