/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void linearsearch(int a[],int n,int val)
{
    int i;
    for(i=0;i<=n;i++)
    {
        if(a[i]==val)
        {
            printf("Element is found %d",i);
            return;
        }
    }
    printf("Elemts is not founded");
}

int main()
{
    int a[]={12,14,24,66,34};
    int n=5;
    int val;
    printf("Enter your valus..");
    scanf("%d",&val);
    linearsearch(a,n,val);
    return 0;
}
