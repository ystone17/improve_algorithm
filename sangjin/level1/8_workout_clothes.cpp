#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = n - lost.size();
    vector<int> need(n+2);

    for(int i = 1; i < lost.size(); i++){
        int index = lost[i];

        need[index] == 1;
    }

    for(int i = 0; i < reserve.size(); i++){
        int index = reserve[i];
        if(need[index] != 0){
            need[index] = 0;
            answer++;
            reserve.erase(reserve.begin() + i);
            i--;
        }
    }

    for(int i = 0; i < reserve.size(); i++){
        int index = reserve[i];
        int seq[] = {-1, 1};

        for(int j = 0; j < 3; j++){
            if(need[index + seq[j]] != 0){
                need[index + seq[j]] = 0;
                answer++;
                break;
            }
        }
    }

    return answer;
}
