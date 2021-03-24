#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    vector<int> arr;
    
    while(n != 0){
        arr.push_back(n%10);
        n /= 10;
    }
    
    sort(arr.begin(), arr.end());
    reverse(arr.begin(), arr.end());

    for(int i = 0; i < arr.size(); i++){
        answer *= 10;
        answer += arr[i];
    }
    
    return answer;
}