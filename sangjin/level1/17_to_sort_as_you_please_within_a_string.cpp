#include <string>
#include <vector>
#include <algorithm>

using namespace std;
int INDEX = 0;

bool compare(string a, string b){
    if (a[INDEX] == b[INDEX]){
        return a < b;
    }
    else{
        return a[INDEX] < b[INDEX];
    }
}

vector<string> solution(vector<string> strings, int n) {
    INDEX = n;
    
    sort(strings.begin(), strings.end(), compare);

    return strings;
}