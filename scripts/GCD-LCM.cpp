#include<bits/stdc++.h>
using namespace std;

// Calculating GCD of two integers
int gcd(int x,int y){
    if(x==y){
        return x;
    }
    if(x==0){
        return y;
    }
    if(y==0){
        return x;
    }
    if(x>y){
        return gcd(x-y,y);
    }
    return gcd(x,y-x);
}

// Calculating LCM of two integers
int LCM(int a,int b){
    int lcm= (a*b)/gcd(a,b);
    return lcm;
}

int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n1,n2;
        cin>>n1>>n2;
        cout<<gcd(n1,n2)<<" "<<LCM(n1,n2)<<endl;
    }

    return 0;
}