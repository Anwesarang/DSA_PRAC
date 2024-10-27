// SUM OF ALL ODD NUMBER FROM 1 TO N //
package DSA_PRAC.DAY1;
import java.util.Scanner;
public class sumodd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SUM OF ALL ODD NUMBER FROM 1 TO N:");
        System.out.print("Enter the value of n:"); 
        int n = sc.nextInt();
        int i,sum;
        sum = 0;
        for(i = 1; i <= n; i++){
            if ( i % 2 != 0){
                System.out.print(i +" ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum of all numbers: "+sum);
        sc.close();
    }
}