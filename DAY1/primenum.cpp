//PRINT PRIME NUMBERS FROM 1 TO N//
#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int i,n,j,flag;
    cout << "PRINT PRIME NUMBERS FROM 1 TO N:\n";
    cout << "Enter the value of n:";
    cin >> n;
    for( int j = 2; j <= n; j++){
        int flag = 0;
        for(i = 2; i <= sqrt(j); i++){
            if (j % i == 0) {
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            cout << j << " ";
        }
    }
}