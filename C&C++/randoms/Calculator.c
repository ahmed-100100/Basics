#include <stdio.h>
#include <math.h>
int main(){
int num1 , num2 ;
char  op;
printf("Enter two integers with an operator between them:\n");
scanf("%d %c %d", &num1 , &op , &num2);
if(op == '+'){
    printf("%d" , num1 + num2 );
}
else if(op == '*'){
    printf("%d",num1*num2);
}
else if(op == '-'){
    printf("%d",num1-num2);
}
else if(op == '/'){
        if(num2!= 0){
    printf("%d",num1/num2);
        }
        else{
        printf("MATH ERROR.");
}
}
else if(op == '%'){
    printf("%d" , num1 % num2 );
}
else{
  printf("Invalid.");
}
}
