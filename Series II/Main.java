#include<iostream>
int main()
{
  int i,n,m=11;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<m*m<<" ";
    m=m+4;
  }
  return 0;
}