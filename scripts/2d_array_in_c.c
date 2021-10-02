#include <stdio.h>

int main()
{
    int x[3][3] = {{0,11,22}, {22,33,44}, {44,55,66}};
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("Element at x[%d][%d]: %d\n", i, j, x[i][j]);
        }
    }
    return 0;
}
