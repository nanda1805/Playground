#include<iostream>
using namespace std;
int main()
{
  int n,e=0,o=0;
  cin>>n;
  cout<<"Enter the number of elements in the array";
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0) e++;
    else if(a[i]%2!=0) o++;
  }
  if(e==n) cout<<"\nThe array is Even";
  else if(o==n) cout<<"\nThe array is Odd";
  else cout<<"\nThe array is Mixed";
  return 0;
 }