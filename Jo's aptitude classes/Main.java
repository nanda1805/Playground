#include<iostream>
using namespace std;
int main()
{
int a,b,c,small=0,gcd=0,d;
cin>>a>>b>>c>>d;
small=(a<b)? ((a<c)?a:c):((b<c)?b:c);
 while(small>=1)
 {
  if (a%small==0 && b%small==0 && c%small==0)
   {
    gcd=small;
    break;
   }
    small--;
  }
  if (gcd==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
