#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,a,b,c;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  a=((fa*(100-fd))/100)+fs;
  b=((sa*(100-sd))/100)+ss;
   c=((aa*(100-ad))/100)+as;
  cout<<"In Flipkart Rs."<<a<<"\n";
  cout<<"In Snapdeal Rs."<<b<<"\n";
  cout<<"In Amazon Rs."<<c<<"\n";
  if(a<b && a<c)
    cout<<"He will prefer Flipkart";
  else if(b<a && b<c)
    cout<<"He will prefer Snapdeal";
  else if(c<a && c<b)
     cout<<"He will prefer Amazon";
  else
      cout<<"He will prefer Flipkart";
  return 0;
}
  
  

