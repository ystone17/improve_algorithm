#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    
    if(s.size() == 4 || s.size() == 6){
        for(int i = 0; i < s.size(); i++){
            if(!(s[i] >= '0' && s[i] <= '9')){
                return false;
            }
        }
        return true;
    }
    
    return false; 
}