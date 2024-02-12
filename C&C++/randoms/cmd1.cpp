#include <iostream>
#include<stdio.h>
using namespace std;
int main(int argc, char *argv[]){
if(argc!=3){            // file name + 2 parameters
        cout<<"ERROR!";
	}
else{
int x, y, power = 1;
x = argv[1][0] - '0'; // to convert the char into an integer
y = argv[2][0] - '0';
for(int i = 1 ; i <= y ; i++ ){power*=x;}
cout<<power;
}
}
