// Calculate nCr binomial coefficient for n and r
package DSA_PRAC.DAY2;
import java.util.Scanner;
class funcfact{
    int factorial(int n){
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
}
class nCr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(n): "); int n = sc.nextInt();
        System.out.print("Enter the number(r): "); int r = sc.nextInt();
        funcfact f = new funcfact();
        int t = n -r;
        int factn = f.factorial(n);
        int factr = f.factorial(r);
        int factnr = f.factorial(t);
        int res = factn / ( factr * factnr);
        System.out.print("The factorial of the number = "+res);
        System.out.println();
        sc.close();
    }
}