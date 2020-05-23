#include<iostream>
using namespace std;
int collatzFunction(int n, int count=1)
{ 
    cout<<n<<endl;
    if(n<=1)
    {
       
        cout<<count-1;
        return 1;
    }
    else if(n%2==0)
    {
             count++;
        return collatzFunction (n/2,count++);
          
    }
    else
    {
       count++;
        return collatzFunction (n*3+1,count++);
    }
 //cout<<count;
}

int main() {
    int n,count;
    cin>>n;
    collatzFunction (n);
    //cout<<count;
    return 0;
}