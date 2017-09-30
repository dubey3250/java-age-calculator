#include<stdio.h>
#include<stdlib.h>
int main()
{
int x[]={3,5,6,17,2,1,12,77,2,0};
int m[10],copy,i,j,count=0;
copy=x[0];
for(i=1,j=0;i<10;i++,j++)
{
    if(copy<x[i])
    {
        m[j]=x[i];
        copy=x[i];
        count++;
    }
}
printf("second large no=%d",x[count-1]);
getchar();
return 0;
}
