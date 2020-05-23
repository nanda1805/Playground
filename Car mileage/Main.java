#include<iostream>
using namespace std;
int main()
{
 int petrol,dist,possibledist;
  float milage;
  std::cin>>petrol>>milage>>dist;
 possibledist=petrol*milage;
  if(possibledist>=dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}