#include<iostream>
#include<vector>
using namespace std;
int main(){
    int arrNum,queries;
    cin>>arrNum>>queries;
    vector<vector<int>>arr(arrNum); 
    for(int i=0 ; i<arrNum ; i++){
        int size;
        cin>>size;
        arr[i].resize(size); 
        for(int j=0 ; j<size ; j++){
            cin>>arr[i][j];
        }
    }
    for (int i=0; i<queries; i++){
        int arrayIndex, elementIndex;
        cin>>arrayIndex>>elementIndex;
        if(arrayIndex < arrNum && elementIndex < arr[arrayIndex].size()) {
            cout<<arr[arrayIndex][elementIndex]<<"\n";
        } else {
            cout << "Invalid index\n";
        }
    }
}
