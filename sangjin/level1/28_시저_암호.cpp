#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";

    for(int i = 0; i < s.size(); i++){
        if(s[i] != ' '){
            if(s[i] <= 'Z'){
                s[i] = (s[i] - 'A' + n) % 26  + 'A' ;
            }
            else{
                s[i] = (s[i] - 'a' + n) % 26  + 'a' ;
            }
        }
    }

    return s;
}