#include<iostream>
using namespace std;
#include<cmath>

int main(){

    int n ;
    cin>>n;
    int org = n ;
    int sum=0;
    while (n > 0){
        int lastdigit = n%10;
        sum+=pow(lastdigit,3);
        n = n/10;
    }
    cout<< sum;
    cout<< org;
    if (org==sum){
        cout << "Armstrong Number!!"<<endl;
    }
    
    
}
