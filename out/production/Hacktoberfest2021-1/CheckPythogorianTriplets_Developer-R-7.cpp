#include<iostream>
#include<cmath>
using namespace std;
bool check(int x, int y ,int z){
    int a = max(x,max(y,z));
    int b,c;

    if (a == x){
        b = y;
        c = z;
    }
    else if (a == y){
        b = x;
        c = z;
    }
    else if (a == z){
        b = x;
        c = y;
    }

    if (a*a == b*b + c*c){
        return true;
    }
    return false;
    
    
    
    
}
int main(){
    int x,y,z;
    cout << "Enter 3 space separted integer values\n";
    cin >> x >> y >> z;
    if (check(x,y,z)){
        cout << "\nThis 3 numbers are Pythogorian Triplet";
    }
    else{
        cout << "\nThis 3 numbers are not a Pythogorian Triplet";
    }
    
}
