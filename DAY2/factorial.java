// print factorial of a the given number
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

class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: "); int n = sc.nextInt();
        funcfact f = new funcfact();
        int res = f.factorial(n);
        System.out.print("The factorial of the number = "+res);
        System.out.println();
        sc.close();
    }
}