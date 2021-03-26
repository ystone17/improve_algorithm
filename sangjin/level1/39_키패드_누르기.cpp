#include <string>
#include <vector>

using namespace std;

const int LEFT = 0, RIGHT = 1;

string answer = "";
vector<int> xIdx;
vector<int> yIdx;
vector<int> curXPos = {0, 2};
vector<int> curYPos = {3, 3};
vector<char> chHand = {'L', 'R'};

void moveFinger(int finger, int key){
    answer.push_back(chHand[finger]);
    curXPos[finger] = xIdx[key];
    curYPos[finger] = yIdx[key];
}

string solution(vector<int> numbers, string hand) {
    int handed = hand.compare("left") == 0 ? LEFT : RIGHT;
    
    for(int i = 0; i < 10; i++){
        xIdx.push_back((i-1)%3);
        yIdx.push_back((i-1)/3);
    }
    xIdx[0] = 1;
    yIdx[0] = 3;
    
    vector<int>::iterator it;
    for(it = numbers.begin(); it != numbers.end(); it++){
        if(xIdx[*it] == 0){
           moveFinger(LEFT, *it);
        }
        else if(xIdx[*it] == 2){
           moveFinger(RIGHT, *it);
        }
        else{
            int lDist = curYPos[LEFT] - yIdx[*it];
            int rDist = curYPos[RIGHT] - yIdx[*it];

            lDist = lDist > 0 ? lDist : lDist * - 1;
            rDist = rDist > 0 ? rDist : rDist * - 1;
            lDist += xIdx[*it] - curXPos[LEFT];
            rDist += curXPos[RIGHT] - xIdx[*it];
            
            if(lDist == rDist){
                moveFinger(handed, *it);
            }
            else if(lDist < rDist){
                moveFinger(LEFT, *it);
            }
            else{
                moveFinger(RIGHT, *it);
            }   
        }
    }

    return answer;
}