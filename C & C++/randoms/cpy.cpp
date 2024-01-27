#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main() {
fstream f1 , f2 ;
f1.open("student.txt" , ios::in);
f2.open("cpy.txt" , ios::out);
if(f1.is_open()&&f2.is_open()){
    string line;
    while(getline(f1,line)){
        if(line=="\0"){continue;}
        else{f2<<line<<'\n';}
    }
    f1.close();
    f2.close();
    cout<<"Mission Completed!\n";
}
else{cout<<"Couldn't access file!\n";}
}
