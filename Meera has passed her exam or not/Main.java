#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  int k,c=0;
  cin>>k;
  for(int i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      cout<<"She passed her exam";
      c=1;
      break;
    }
  }
  if(c==0) cout<<"She failed";
  return 0;
  
}