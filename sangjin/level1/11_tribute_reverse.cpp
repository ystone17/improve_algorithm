#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> arr;
    int BASE = 3;
    int multi = 1;

    for(n; n != 0; n/=BASE){
       arr.push_back(n%BASE);
    }

    for(int i = arr.size()-1; i >= 0; i--){
        answer += multi * arr[i];
        multi *= BASE;
    }

    return answer;
}

int main(){
    cout << solution(45);
    return 0;
}