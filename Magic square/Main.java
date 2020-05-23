#include<iostream>
using namespace std;
int main()
{
  int n,c1=0,c2=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      cin>>a[i][j];
      if(i==j) c1+=a[i][j];
      if((i+j)==n-1) c2+=a[i][j];
     }
  }
  if(c1==c2) cout<<"Yes";
  else cout<<"No";
  return 0;
  }