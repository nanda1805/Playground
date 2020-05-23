#include<iostream>
using namespace std;
int main()
{
 int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { for(int j=1;j<=i;j++)
  { cout<<i;
        if(j<i)
          cout<<"*";}
  cout<<"\n";}
  for(int k=n;k>=1;k--)
  { 
    for(int j=1;j<=k;j++)
  	{ 
      cout<<k;
      if(j<k)
         cout<<"*";
    }
  	cout<<"\n";
  }
}