#include <iostream>
using namespace std;
int main() 
{
   int i,j,n,num=1;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			cout<<num+1;
		}
		for(j=1;j<=n-1;j++)
		{
		cout<<num;
		}
		if(i%2!=0)
		{
			cout<<num+1;
		}
		num++;
		cout<<"\n";
	}
    return 0;
}