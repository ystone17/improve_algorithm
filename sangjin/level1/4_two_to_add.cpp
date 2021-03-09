#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    int times[201] = {0};           // 덧셈 결과의 횟수를 저장하는 배열 
    int max = numbers[0];           // numbers 배열의 최댓값
    int length = numbers.size();    // numbers 배열의 길이  

    for(int i = 1; i < length; i++){
        if(max < numbers[i]){
            max = numbers[i];
        }
    }
    
    for(int i = 0; i < length; i++){
        for(int j = i + 1; j < length; j++){
            times[numbers[i] + numbers[j]]++;
        }
    }

    for(int i = 0; i <= max*2; i++){
        if(times[i] != 0){
            answer.push_back(i);
        }
    }

    return answer;
}