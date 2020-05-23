#include<iostream>
using namespace std;
int main()
{
  long num, temp;
  int count = 0;
  cin>>num;
  temp = num;
  while(temp > 0) {
     count++;
     temp /= 10;
  }
  if (count==0)
    count = 1;
 cout<<count;
 return 0;
  
}