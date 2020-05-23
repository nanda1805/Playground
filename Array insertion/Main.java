#include<iostream>
using namespace std;
int main()
{
  int n,p,k;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++) cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>p;
  cin>>k;
  if(k>0){
  cout<<"\nEnter the value to insert";
n++;
  for(int i=n;i>=p;i--) a[i]=a[i-1];
  a[p-1]=k;
  cout<<"\nArray after insertion is";
  for(int i=0;i<n;i++) cout<<"\n"<<a[i];
  }
else cout<<"\nInvalid Input";
  return 0;
 }