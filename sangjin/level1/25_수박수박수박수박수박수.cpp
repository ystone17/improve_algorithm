#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";

    for(int i = 0; i < n/2; i++){
        answer += "수박";
    }

    n%2 == 0 ? answer : answer += "수";
    
    return answer;
}