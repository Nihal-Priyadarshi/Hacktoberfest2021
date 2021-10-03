
#include <bits/stdc++.h>
using namespace std;


// Function to rotate the matrix 90 degree c
void rotate(vector<vector<int>> &v)
{
	int n=v.size();

	// Traverse each cycle
	for (int i = 0; i < n / 2; i++) {
		for (int j = i; j < n - i - 1; j++) {

			// Swap elements of each cycle
			// in clockwise direction
			int temp = v[i][j];
			v[i][j] = v[n - 1 - j][i];
			v[n - 1 - j][i] = v[n - 1 - i][n - 1 - j];
			v[n - 1 - i][n - 1 - j] = v[j][n - 1 - i];
			v[j][n - 1 - i] = temp;
		}
	
	}
}


int main() {

vector<vector<int>> vec{ { 1, 2, 3, 4 }, 
                         { 5, 6, 7, 8}, 
                         { 9, 10,11, 12},
                         {13, 14, 15, 16} };
                         
cout<<"Before rotation :"<<endl;
for(int i=0;i<vec.size();i++){
	for(auto it:vec[i]){
			cout<<it<<" ";
	}
	cout<<"\n";
}	  
//Rotate by 90 degree
rotate(vec);
cout<<"After rotation :"<<endl;
for(int i=0;i<vec.size();i++){
	for(auto it:vec[i]){
			cout<<it<<" ";
	}		  
		cout<<"\n";
}
		return 0;
};
