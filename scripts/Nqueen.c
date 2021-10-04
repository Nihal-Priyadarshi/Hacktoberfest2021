#include<stdio.h>
#include<math.h>
 
int chessboard[20],count;
 
int main()
{
int k,i,j;
void Q(int row,int n);
 
printf("Backtracking Nqueen");
printf("\n\nEnter no of Queens:");
scanf("%d",&k);
Q(1,k);
return 0;
}
 
void print(int k)
{
int i,j;
printf("\n\nOutput %d:\n\n",++count);
 
for(i=1;i<=k;++i)
  printf("\t%d",i);
 
for(i=1;i<=k;++i)
{
  printf("\n\n%d",i);
  for(j=1;j<=k;++j) 
  {
   if(chessboard[i]==j)
    printf("\tQ"); 
   else
    printf("\t-"); 
  }
}
}
 

int place(int row,int col)
{
int i;
for(i=1;i<=row-1;++i)
{
  if(chessboard[i]==col)
   return 0;
  else
   if(abs(chessboard[i]-col)==abs(i-row))
    return 0;
}
 
return 1; 
}
 

void Q(int row,int n) 
{
int col;
for(col=1;col<=n;++col)
{
  if(place(row,col))
  {
   chessboard[row]=col; 
   if(row==n) 
    print(n); 
   else 
    Q(row+1,n);
  }
}
}