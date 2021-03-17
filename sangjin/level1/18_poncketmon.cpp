#include <vector>

using namespace std;

int solution(vector<int> nums){
    int answer = 0;
    vector<int> poncektmon(200001, 0);
    int kinds = 0;

    for(int i = 0; i < nums.size(); i++){
        if(poncektmon[nums[i]] == 0){
            kinds++;
        }    
        poncektmon[nums[i]]++;   
    }
        
    answer = kinds > nums.size()/2 ? nums.size()/2 : kinds;

    return answer;
}