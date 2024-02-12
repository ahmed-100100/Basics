#include <stdio.h>
#include <math.h>
int main(){
int salary;
printf("Enter the salary: ");
scanf("%d" , &salary);
if(salary >= 5000){
printf("Net Salary = %.2f $", salary -  salary * 0.15);
}
else if(salary >= 3000){
printf("Net Salary = %.2f $", salary - salary * 0.1);
}
else if(salary >= 1000 && salary < 1500){
printf("Net Salary = %.2f $", salary + 200);
}
else if(salary < 3000 && salary >= 1500){
printf("Net Salary = %.2f $", salary - salary * 0.05);
}
else{
printf("ERROR.");
}
}
