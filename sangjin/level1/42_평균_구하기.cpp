#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;

    for(auto it = arr.begin(); it != arr.end(); it++){
        answer += *it;
    }

    answer /= arr.size();

    return answer;
}