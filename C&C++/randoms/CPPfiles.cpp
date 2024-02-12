//Handling files in cpp
#include<iostream>
#include<string>
#include<fstream>
using namespace std;
int main(){
fstream file;
/*file.open("hey.txt" , ios::out);
if(file.is_open()){
    file<<"Hello\n";
    file<<"This how we create a file using cpp language...";
    file.close();
}
else{cout<<"Couldn't access the file!";}*/

/*file.open("hey.txt" , ios::app);
if(file.is_open()){
    file<<"\nAnd this how we append to a file using cpp language...";
    file.close();
}
else{cout<<"Couldn't access the file!";}*/

/*file.open("hey.txt" , ios::in);
if(file.is_open()){
    string line;
    while(getline(file,line)){cout<<line<<endl;}//(endl = '\n')
    file.close();
}
else{cout<<"Couldn't access the file!";}*/

}
