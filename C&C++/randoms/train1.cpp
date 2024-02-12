#include <iostream>
#include <cstring>
using namespace std;
int main(){
    string record;
    int scoreA=0 , scoreB=0 , flag=0;
    cout<<"Enter Record:";
    cin>>record;
    for(int i=0 ; record[i]!='\0' ; i+=2){
        if((record[i+1]=='1'||record[i+1]=='2')){
            if(record[i]== 'A'){scoreA+=record[i+1]-48;}
            else if(record[i]=='B'){scoreB+=record[i+1]-48;}
            else{cout<<"\nWrong Input!\n";break;}
            if(scoreA==10&&scoreB==10){flag=1;}
        }
        else{cout<<"\nWrong Input!\n";break;}
    }
    if(flag==1){
        if(scoreA>=scoreB+2){cout<<"A";}
        else if(scoreB>=scoreA+2){cout<<"B";}
        else{cout<<"Illegal Score!";}
        }
    else{
        if(scoreA==11&&scoreB<=9){cout<<"A";}
        else if(scoreB==11&&scoreA<=9){cout<<"B";}
        else{cout<<"Illegal Score!";}
    }
}
