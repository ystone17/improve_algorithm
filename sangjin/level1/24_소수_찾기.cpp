#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> prime(1000001, 1);
    
    for(int i = 2; i <= prime.size()/2; i++){
        for(int j = 2; i*j < prime.size(); j++){
            prime[i*j] = 0;
        }
    }

    for(int i = 2; i <= n; i++){
        if(prime[i] == 1){
            answer++;
        }
    }

    return answer;
}

