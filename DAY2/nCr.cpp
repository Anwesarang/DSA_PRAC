// Calculate nCr binomial coefficient for n and r
#include<iostream>
using namespace std;

int factorial(int n){
    int fact = 1;
    for(int i = n;i >= 1;i--){
        fact = fact * i;
    }
    return fact;
}

int main(){
    int n,r;
    cout << "Enter the number(n): ";cin >> n;
    int factn = factorial(n);
    cout << "Enter the number(r): ";cin >> r;
    int factr = factorial(r);
    int t = n - r;
    int factnr = factorial(t);
    int res = factn / ( factr * factnr ); 
    cout << "The factorial of the number is: " << res;
    return 0;
}
