package DSA_PRAC.DAY3;

import java.util.Scanner;

class linearSearch {
    public int lisearch(int[] arr,int item){
        for( int i = 0; i < arr.length; i++){
            if( arr[i] == item){
                return i;
            }
        }return -1;
    }
}

public class linearS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for( int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }System.out.print("Enter the item you want to search: ");int item = sc.nextInt();
        linearSearch l = new linearSearch();
        int res = l.lisearch(arr,item);
        if(res > 0){
            System.out.println("Element is found at "+res+" th position");
        }else{
            System.out.println("Element is not found");
        }
        sc.close();
    }
}
