package javadevelop.oop;

public class Lab1 {
    public static void main(String[] args) {
       final long a = 1;
       final long b = 0;
       final long m = 2;
       final long n = 3;
       final long C = 2;
       double S = 0;
       if ((a<=n)&&(b<=m)) {
        for (long i = a; i <= n; i++) {
            if (i+C==0) {
                System.out.println("Error! Division by zero!");
                break;
            }
            for (long j = b; j <= m; j++) {
                S += (double)(i+j)/(i+C);
            }
        }
           System.out.println("S = "+ S);
       }
       else System.out.print("Error! The limits are smaller than the begging numbers!");
    }
}
