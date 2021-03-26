#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {

    for(auto it = phone_number.begin(); it != phone_number.end()-4; it++){
        *it = '*';
    }

    return phone_number;
}