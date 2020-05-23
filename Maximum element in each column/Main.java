#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  int max[c];
 for(int j=0;j<c;j++) max[j]=a[0][j];
  for(int j=0;j<c;j++){
    for(int i=0;i<r;i++){
      if(a[i][j]>max[j]){
        max[j]=a[i][j];
      }
    }
  }
    for(int j=0;j<c;j++) cout<<max[j]<<"\n";
    
}