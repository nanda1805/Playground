#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  float a;
  cin>>n;
  a=sqrt(n);
  cout<<int(n+(n/a))+1;
}