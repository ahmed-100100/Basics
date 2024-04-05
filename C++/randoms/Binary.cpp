//w+ : in , out , trunc / r+ : in , out / a+ : in , app
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main() {
fstream file;
file.open("square.bin" , ios::in | ios::out | ios::trunc | ios::binary);
if(file.is_open()){
        string line;
    int data[] = { 1, 2, 3, 4, 5 };
    file.write(reinterpret_cast<const char*>(data), sizeof(data));
    file.seekg(0, ios::beg); //returns the cursor to the start point.
    while(getline(file,line)){cout<<line<<endl;}
    file.close();
}
else{cout<<"Couldn't access file!";}
}
