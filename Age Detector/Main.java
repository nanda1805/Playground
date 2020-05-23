#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  if(x>y)
  {
    int a=1900+x;
    int b=2000+y;
      cout<<b-a;
  }
  else
 {
   int a=2000+x;
   int b=2000+y;
       cout<<b-a;
  }
}