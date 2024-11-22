#include<iostream>
using namespace std;

int linearS(int arr[],int n,int item){
    for( int i = 0;i <= n; i++){
        if( arr[i] == item ){
            return i + 1;
            break;
        }
        if( i >= n){
            return 0;
        }
    }
}
int main(){
    int n,item;
    cout << "Enter the size of array: ";cin >> n;
    int arr[n];
    cout << "Enter the elements of array: " << endl;
    for(int i = 0;i < n;i++){
        cin >> arr[i];
    }
    cout << "Enter the item you want to search: ";cin >> item;
    int res = linearS(arr,n,item);
    if( res > 0){
        cout << "Element found at "<<res <<" th position" << endl;
    }else{
        cout << "Element does not found" << endl;
    }
    return 0;
}