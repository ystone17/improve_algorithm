#include <vector>
#include <iostream>
using namespace std;

int solution(vector<int> nums) {
    int answer = 0;
    vector<bool> prime(3000, true);

    for(int i = 2; i < 1500; i++){
        for(int j = 2; i*j < 3000; j++){
            prime[i*j] = false;
        }
    }

    for(auto i = nums.begin(); i < nums.end(); i++){
        for(auto j = i+1; j < nums.end(); j++){
            for(auto k = j+1; k < nums.end(); k++){
                if(prime[*i + *j + *k]){
                    answer++;
                }
            }
        }
    }

    return answer;
}