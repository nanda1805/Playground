#include<iostream>
int main()
{
  int i,n,j;
  std::cin>>n;
  for(i=n;i<=n+3;i++)
  {  for(j=n;j<=i;j++)
  {
    std::cout<<i;
  }
   std::cout<<"\n";
  }
  for(i=n+3;i>=n;i--)
  {
    for(j=n;j<=i;j++)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
  }

  return 0;
}