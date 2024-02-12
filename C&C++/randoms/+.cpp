//w+ : in , out , trunc / r+ : in , out / a+ : in , app
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main() {
fstream file;
file.open("square.txt" , ios::in | ios::app);
if(file.is_open()){
        string line;
    file<<"\nEnd of text...\n";
    file.seekg(0, ios::beg); //returns the cursor to the start point.
    while(getline(file,line)){cout<<line<<endl;}
    file.close();
}
else{cout<<"Couldn't access file!";}
}
