#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int preNum = -1;

    for(int i = 0; i < arr.size(); i++){
        if(preNum != arr[i]){
            answer.push_back(arr[i]);
        }
        preNum = arr[i];
    }

    return answer;
}