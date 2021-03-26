#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    int big, small;
    int gcd, lcm;

    big = n > m ? n : m;
    small = n > m ? m : n;

    while(true){
        gcd = big%small;
        if(gcd == 0){
            gcd = small;
            break;
        }

        big = small;
        small = gcd;
    }

    lcm = n * m / gcd;

    answer.push_back(gcd);
    answer.push_back(lcm);

    return answer;
}