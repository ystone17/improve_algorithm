#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "김서방은 에 있다";
    int index = 0;

    for(int i = 0; i < seoul.size(); i++){
        if(seoul[i] == "Kim"){
            index = i;
            break;
        }
    }

    answer.insert(13, to_string(index));    
    
    return answer;
}