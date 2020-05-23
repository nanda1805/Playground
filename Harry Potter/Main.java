#include<iostream>
using namespace std;
int main()
{
  int n;
 std::cin>>n;
  int k=n%10;
  int c=0,p=0;
  while(n>0)
  {
    c++;
    if(c==3) p=(n/10)%10;
    n/=10;
}
  std::cout<<(k+p);
}