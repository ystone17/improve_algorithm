#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    int start;
    int end;
    
    start = a < b ? a : b;
    end = a < b ? b : a;
    
    for(int i = start; i <= end; i++){
        answer += i;
    }
    
    return answer;
}