#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    vector<int> days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    vector<string> day_str = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

    for(int i = 2; i < days.size(); i++){
        days[i] += days[i-1];
    }

    int index = (days[a-1] + b - 1) % 7;

    answer = day_str[index];

    return answer;
}