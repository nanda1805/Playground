#include <stdio.h>
#define MAXROW		10
#define MAXCOL		10
int main()
{
	int matrix[MAXROW][MAXCOL];
	int i,j,r,c;
	int sum,product;
    scanf("%d",&r);
	scanf("%d",&c);
for(i=0;i< r;i++)
	{
		for(j=0;j< c;j++)
		{
			scanf("%d",&matrix[i][j]);
		}
	}
	//printf("\n");
	
	for(i=0;i< r;i++)
	{
		sum=0;		
		for(j=0;j< c;j++)
		{
			//printf("%d\t",matrix[i][j]);	
			sum+=matrix[i][j];
		}
		printf("%d",sum);
		printf("\n");			
	}

}