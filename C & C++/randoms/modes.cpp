#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main() {
string name , ID , grade ;
cout<<"Please Enter your Name: ";
cin>>name;
cout<<"Please Enter your ID: ";
cin>>ID;
cout<<"Please Enter your Grade: ";
cin>>grade;
fstream file;
ifstream ifs("student.txt");
if (ifs.good()){
    file.open("student.txt" , ios::app);
    file<<"\n------------------------\n";
    file<<"Name: "<<name<<'\n';
    file<<"ID: "<<ID<<'\n';
    file<<"Grade: "<<grade<<'\n';
    cout<<"\nRegistration Completed!\n\n";
    file.close();
    }
else {
    file.open("student.txt" , ios::out);
    file<<"Name: "<<name<<'\n';
    file<<"ID: "<<ID<<'\n';
    file<<"Grade: "<<grade<<'\n';
    cout<<"\nRegistration Completed!\n\n";
    file.close();
}
file.open("student.txt" , ios::in);
if(file.is_open()){
    string line;
    while(getline(file,line)){cout<<line<<endl;}
    file.close();
}
else{cout<<"Couldn't access the file!";}
}
