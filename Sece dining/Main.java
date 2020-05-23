#include<iostream>
using namespace std;
int main()
{
 char s[6];
  int a;
  cin>>s>>a;
  if(s[0] == 'f')
  {
    if(a==1) cout<<"Left Handed";
    else cout<<"Right Handed";
  }
  else
  {
    if(a==1) cout<<"Right Handed";
    else cout<<"Left Handed";
  }
}
  
