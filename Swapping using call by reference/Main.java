#include<iostream>
using namespace std;
void swap(int &,int &);
int main()
{
	int a,b;

	cin>>a;
	
	cin>>b;
	cout<<"Before swapping a= "<<a<<" and b="<<b;
	swap(a,b);
	//cout<<"\n After swapping a= "<<a<<"and b= "<<b; 
}
void swap(int &a,int &b)
{
	int c;
	c=a;
	a=b;
	b=c;
	cout<<"\nAfter swapping a= "<<a<<" and b="<<b; 
}

 