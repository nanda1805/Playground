#include<stdio.h>
#include<malloc.h>
int** create(int m, int n)
{
    int **a, i;
    a= (int **)malloc(m*sizeof(int *));
    for(i=0; i<m; i++)
    {
        *(a+i) = (int *)malloc(n*sizeof(int ));
    }
    return a;
}
void read(int **a, int m, int n)
{
    int i, j;
    for(i=0; i<m; i++)
    {
        for(j=0; j<n; j++)
        {
            scanf("%d", (*(a+i)+j));
        }
    }
}

void findMax(int** a,int m,int n)
{
 int i,j,max;

 for(i=0;i<m;i++)
 {
     max=-9999;
     for(j=0;j<n;j++)
     {
         if(max < (*(*(a+i)+j)))
         {
             max=*(*(a+i)+j);
         }
     }
     printf("%d\n",max);
 }
}
int main()
{
    int **a, m, n;
    
    scanf("%d",&m);
   
    scanf("%d",&n);
    
    a = create(m,n);
    read(a,m,n);
    findMax(a,m,n);
    return 0;
}