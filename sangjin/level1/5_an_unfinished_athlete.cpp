#include <string>
#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;

long long hash(string s){
    const int m = 1e9 + 9; // 적당히 큰 소수...
    vector<long long> p = {1};
    long long hash = 0;

    for(int i = 0; i < s.size(); i++){
        hash = (hash + (s[i] - 'a' + 1) * p[i]) % m;
    }
    return hash;
}

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    return answer;
}