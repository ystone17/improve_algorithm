#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    int minIdx = 0;
    
    if(arr.size() == 1){
        arr.clear();
        arr.push_back(-1);
    }
    else{
        for(int i = 1; i < arr.size(); i++){
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        arr.erase(arr.begin() + minIdx);
    }
    
    return arr;
}