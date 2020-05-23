#include <stdio.h>  
#include <string.h>  
   
int main()  
{  
   char string[100];
  scanf("%s",string);
    int count = 0;  
      
    //Counts each character except space  
    for(int i = 0; i < strlen(string); i++) {  
        if(string[i] != ' ')  
            count++;  
    }  
      
    //Displays the total number of characters present in the given string  
    printf("The number of letters in the name is %d", count);  
   
    return 0;  
}  