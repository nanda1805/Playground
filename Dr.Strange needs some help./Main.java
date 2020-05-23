#include<iostream>
void pri(int,int,int);
using namespace std;
int main()
{
   int m,n,r;
  int i,j,sum=1;
  cin>>m>>n>>r;
  for(i=1;i<=n;i++)
  {
    sum=sum*m;
  }
  if (sum>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}