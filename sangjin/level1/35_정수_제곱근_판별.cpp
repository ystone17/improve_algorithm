#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    vector<long long> square(1, 0);

    for(long long i = 1; i * i <= 50000000000000; i++){
        square.push_back(i*i);
    }

    int num = (int)sqrt(n);

    if(n == square[num]){
         answer = square[num + 1];
    }else{
        answer = -1;
    }

    return answer;
}