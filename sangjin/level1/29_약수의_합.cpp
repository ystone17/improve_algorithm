#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    vector<int> sum(3001, 0);

    for(int i = 1; i < sum.size(); i++){
        for(int j = 1; i * j <= sum.size() - 1; j++){
            sum[i*j] += j;
        }
    }

    return sum[n];
}