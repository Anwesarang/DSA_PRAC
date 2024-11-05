// print factorial of a the given number
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
    int n;
    cout << "Enter the number: ";cin >> n;
    int res = factorial(n);
    cout << "The factorial of the number is: " << res;
    return 0;
}