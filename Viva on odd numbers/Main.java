#include<iostream>
using namespace std;
int main()
{
  int n,count=1;
  float score=0;
 while(count<=3){
  std::cin>>n;
   if(n<0){
     score-=1;
     break;}
   else if(n%2!=0){
     score+=1;
     count++;
   }
   else if(n%2==0){
     score-=0.5;}
}
std::cout<<score;
}