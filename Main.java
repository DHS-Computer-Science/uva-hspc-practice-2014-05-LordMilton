//TODO: <name>
//TODO: <date>
//Practice 2014 - 05: Safe Zone
import java.util.Scanner;

public class Main {
   public static long foo(long n, long p, long q, long j, long k)
   {
      long works = 0;
      if(k==0)
         return j <= q && j >= p?1:0;
      if(j > 0)
         works += foo(n,p,q,j-1,k-1);
      if(j < n-1)
         works += foo(n,p,q,j+1,k-1);
      return works;
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      do{
         long n = scan.nextInt();
         long p = scan.nextInt();
         long q = scan.nextInt();
         long j = scan.nextInt();
         long k = scan.nextInt();
         if(n==0)
            break;
         System.out.println(foo(n,p,q,j,k));
      }
      while(true);
      System.exit(0);
   }
}
