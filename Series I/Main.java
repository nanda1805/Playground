#include<iostream>
int main()
{
  int n,i;
  float m=0.5;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<m<<" ";
    m=m*3;
  }
  return 0;
}