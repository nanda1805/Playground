#include<iostream>
int main()
{
  int i,n,m=6;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<m<<" ";
    m=m+(5*i);
  }
}