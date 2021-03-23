#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    int index = 0;
    for(int i = 0; i < s.length(); i++){
        if(s[i] == ' '){
            index = 0;
            continue;
        }
        else if(index % 2 == 0){
            s[i] = toupper(s[i]);
        }
        else if(index % 2 == 1){
            s[i] = tolower(s[i]);
        }
        index++;
    }
    return s;
}