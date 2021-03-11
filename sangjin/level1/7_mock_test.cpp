#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    vector<vector<int>> students = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
    vector<int> score(students.size());

    for(int i = 0; i < answers.size(); i++){
        for(int j = 0; j < students.size(); j++){
            score[j] += int(answers[i] == students[j][i%students[j].size()]);
        }
    }

    vector<int>::iterator it;
    int max = 0;
    for(it = score.begin(); it != score.end(); it++){
        if(max < *it){
            max = *it;
        }
    }

    for(int i = 0; i < score.size(); i++){
        if(max == score[i]){
            answer.push_back(i+1);
        }
    }

    return answer;
}
