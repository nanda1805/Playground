#include <iostream>
#include<string>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student s1;
  std::cin.getline(s1.name,100);
   std::cin>>s1.roll;
   std::cin>>s1.marks;
  std::cout<<"\nStudent Details\nName: "<<s1.name<<"\nRoll: "<<s1.roll<<"\nMarks: "<<s1.marks;
  
}