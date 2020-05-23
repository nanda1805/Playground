#include <iostream> 
#include <cctype>
using namespace std; 

int main(){
    int n,i=1,sum=0,m,o;
    cin>>n;
    cin>>m;
    o=m+n;
    while(i<o){
       if(o%i==0)
       		sum=sum+i;
       i++; 
	}
 
if(sum==o)
    cout<<"They can read the message"; 
else
    cout<<"They can't read the message";
    //system("pause"); 

return 0;
}