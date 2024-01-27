#include<iostream>
#include<cmath>
#include<ctime>
using namespace std;
char user_choise(){
char choice;
cout<<"\t\t\t\t\t  ROCK PAPER SCISSORS GAME\n";
cout<<"\t\t\t\t\t****************************\n";
do{
cout<<"Press:\n";
cout<<"'R' for Rock.\n";
cout<<"'P' for Paper.\n";
cout<<"'S' for Scissors.\n";
cin>>choice;
if(choice != 'R' && choice != 'P' && choice != 'S' && choice != 'r' && choice != 'p' && choice != 's'){cout<<"\nINVALID INPUT!\n\n";}
} while(choice != 'R' && choice != 'P' && choice != 'S' && choice != 'r' && choice != 'p' && choice != 's');
return choice;
}
char computer_choise(){
srand(time(0));
int num = rand()%3+1;
switch(num){
case 1 : return 'R' ; break;
case 2 : return 'P' ; break;
case 3 : return 'S' ; break;
}
}
void show_choice(char choise){
switch (choise){
case 'R': cout<<"Rock"; break;
case 'P': cout<<"Paper"; break;
case 'S': cout<<"Scissors"; break;
case 'r': cout<<"Rock"; break;
case 'p': cout<<"Paper"; break;
case 's': cout<<"Scissors"; break;
}
}
void show_winner(char player , char computer){
switch(player){
case 'R': if(computer == 'R'){cout<<"TIED!\n";}
          else if(computer == 'P'){cout<<"You Lost!\n";}
          else if(computer == 'S'){cout<<"You Won!\n";}break;
case 'P': if(computer == 'R'){cout<<"You Won!\n";}
          else if(computer == 'P'){cout<<"TIED!\n";}
          else if(computer == 'S'){cout<<"You Lost!\n";}break;
case 'S': if(computer == 'R'){cout<<"You Lost!\n";}
          else if(computer == 'P'){cout<<"You Won!\n";}
          else if(computer == 'S'){cout<<"TIED!\n";}break;
case 'r': if(computer == 'R'){cout<<"TIED!\n";}
          else if(computer == 'P'){cout<<"You Lost!\n";}
          else if(computer == 'S'){cout<<"You Won!\n";}break;
case 'p': if(computer == 'R'){cout<<"You Won!\n";}
          else if(computer == 'P'){cout<<"TIED!\n";}
          else if(computer == 'S'){cout<<"You Lost!\n";}break;
case 's': if(computer == 'R'){cout<<"You Lost!\n";}
          else if(computer == 'P'){cout<<"You Won!\n";}
          else if(computer == 'S'){cout<<"TIED!\n";}break;
}
}
int main(){
    char letter = 'R' ;
    while(letter == 'R' || letter == 'r'){
    char player = user_choise();
    char computer = computer_choise();
    cout<<"Your Choice: "; show_choice(player); cout<<"\n";
    cout<<"Computer Choice: "; show_choice(computer); cout<<"\n";
    show_winner(player , computer);
    cout<<"\nPress 'R' to replay or 'Q' to quit.\n";
    cin>>letter;
    }
}
