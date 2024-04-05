#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n,q;
    cin>>n>>q;
    vector<vector<int>>arr(n); 
    for(int i=0 ; i<n ; i++){
        int k;
        cin>>k;
        arr[i].resize(k); 
        for(int j=0 ; j<k ; j++){
            cin>>arr[i][j];
        }
    }
    for (int i=0; i<q; i++){
        int arrayIndex, elementIndex;
        cin>>arrayIndex>>elementIndex;
        if(arrayIndex < n && elementIndex < arr[arrayIndex].size()) {
            cout<<arr[arrayIndex][elementIndex]<<"\n";
        } else {
            cout << "Invalid index\n";
        }
    }
}
