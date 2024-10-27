
//PRINT PRIME NUMBERS FROM 1 TO N//
package DSA_PRAC.DAY1;
import java.util.Scanner;
public class primenum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRINT PRIME NUMBERS FROM 1 TO N:");
        System.out.print("Enter the value of n:");int n = sc.nextInt();
        for( int j = 2; j <= n; j++){
            int flag = 0;
            int i = 2;
            for(i = 2; i <= Math.sqrt(j); i++){
                if (j % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(j + " ");
            }
        }
    }
}
