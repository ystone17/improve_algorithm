#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    vector<int> temp_arr;
   
    for(int i = 0; i < commands.size(); i++){
        int start = commands[i][0]-1;
        int fin = commands[i][1];
        int k = commands[i][2]-1;

        temp_arr.clear();
        temp_arr.assign(array.begin()+start , array.begin()+fin);
        sort(temp_arr.begin(), temp_arr.end());

        answer.push_back(temp_arr[k]);
    }

    return answer;
}
