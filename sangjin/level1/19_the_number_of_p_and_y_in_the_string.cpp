#include <string>
using namespace std;

bool solution(string s){
    int pCounter = 0;
    int yCounter = 0;

    for(int i = 0; i < s.size(); i++){
        s[i] = tolower(s[i]);
        
        if(s[i] == 'p'){
            pCounter++;
        }
        else if(s[i] == 'y'){
            yCounter++;
        }
    }
    
    return pCounter == yCounter;
}