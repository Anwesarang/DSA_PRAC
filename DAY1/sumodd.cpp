// SUM OF ALL ODD NUMBER FROM 1 TO N //
#include<iostream>
using namespace std;

int main(){
    int n,i,sum;
    cout << "SUM OF ALL ODD NUMBER FROM 1 TO N:\n";
    cout << "Enter the value of n:";
    cin >> n;
    sum = 0;
    for( i = 1; i <= n ; i++){
        if( i % 2 != 0){
            cout << i << "  ";
            sum = sum + i;
        }
    }
    cout << "\nThe sum of all numbers: " << sum;
    return 0;
}
