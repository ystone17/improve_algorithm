#include <string>
#include <vector>

using namespace std;

string step1(string id);
string step2(string id);
string step3(string id);
string step4(string id);
string step5(string id);

string solution(string new_id) {
    string answer = "";

    answer = step1(new_id);
    
    // while (answer != new_id){
    //     answer = new_id;
    //     new_id = step4(answer);
    // }

    return answer;
}

string step1(string id){
    for(int i = 0; i < id.size(); i++){
        id[i] = tolower(id[i]);
    }
    return step2(id);
}

string step2(string id){
    char special[] = { '-', '_', '.' };
    int length =  sizeof(special)/sizeof(char);
    bool isErase;
   
    for(int i = 0; i < id.size(); i++){
        char ch = id[i];
        isErase = true;

        if((ch < 'a' || ch > 'z') && (ch < '0' || ch > '9')){             // 아이디가 소문자나 숫자가 아닐 때 
            for(int j = 0; j < length; j++){
                if(ch == special[j]){
                    isErase = false;
                    break;
                }
            }
            if(isErase){
                id.erase(i, 1);
                i--;
            }
        }
    }

    return step3(id);
}

string step3(string id){
    int dotCount = 0;
    for(int i = 0; i < id.size(); i++){
        if(id[i] == '.'){
            dotCount++;
        }
        else{
            dotCount = 0;
        }

        if(dotCount == 2){
            id.erase(i, 1);
            i--;
            dotCount--;
        }
    }

    return step4(id);
}

string step4(string id){
    while(true){
        if(id[0] == '.'){
            id.erase(0, 1);
        }
        else if(id.back() == '.'){
            id.erase(id.size()-1, 1);
        }
        else{
            return step5(id);
        }
    }
}

string step5(string id){
    if(id.empty()){
        id = "aaa";
    }
    else if(id.size() >= 16){
        id.erase(15);
        return step4(id);
    }
    else if(id.size() < 3){
        while(true){
            char ch = id.back();
            id += ch;

            if(id.size() == 3){
                break;
            }
        }
    }
    return id;
}