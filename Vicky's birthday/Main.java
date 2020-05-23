#include<iostream>
int main()
{
  int yr;
  std::cin>>yr;
  if(yr%4==0)
  {
    if(yr%100==0)
    {
      if(yr%400==0)
       std::cout<<"Vicky can celebrate his birthday.";
      else
       std::cout<<"Vicky can't celebrate.";
    }
    else
    std::cout<<"Vicky can celebrate his birthday.";}
  else
   std::cout<<"Vicky can't celebrate.";}