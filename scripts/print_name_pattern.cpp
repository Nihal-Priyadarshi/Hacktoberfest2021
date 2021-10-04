#include <iostream>
using namespace std;

 
// Below height and width variable can be used
// to create a user-defined sized alphabet's pattern
 
// Number of lines for the alphabet's pattern
int height = 5;
// Number of character width in each line
int width = (2 * height) - 1;
 
// Function to find the absolute value
// of a number D
int abs(int d)
{
    return d < 0 ? -1 * d : d;
}

// Function to print the pattern of 'A'
void printA()
{
    int n = width / 2, i, j;
    for (i = 0; i < height; i++) {
        for (j = 0; j <= width; j++) {
            if (j == n || j == (width - n)
                || (i == height / 2 && j > n
                    && j < (width - n)))
                cout <<"*";
            else
                cout <<" ";
        }
        cout <<"\n";
        n--;
    }
}

// Function to print the pattern of 'N'
void printN()
{
    int i, j, counter = 0;
    for (i = 0; i < height; i++) {
        cout <<"*";
        for (j = 0; j <= height; j++) {
            if (j == height)
                cout <<"*";
            else if (j == counter)
                cout <<"*";
            else
                cout <<" ";
        }
        counter++;
        cout <<"\n";
    }
}

// Function to print the pattern of 'Y'
void printY()
{
    int i, j, counter = 0;
    for (i = 0; i < height; i++) {
        for (j = 0; j <= height; j++) {
            if (j == counter
                || j == height - counter
                    && i <= height / 2)
                cout <<"*";
            else
                cout <<" ";
        }
        cout <<"\n";
        if (i < height / 2)
            counter++;
    }
}

int main() {
	printA();
	cout<<endl;
	printN();
	cout<<endl;
	printA();
	cout<<endl;
	printN();
	cout<<endl;
	printY();
	cout<<endl;
	printA();
	
	return 0;
}
