#include <string>
#include <vector>

using namespace std;

vector<int> getTopOfBoard(vector<vector<int>> board){
    int depth = board[0].size();    // 격자 깊이
    vector<int> top_arr = {};       // 각 열의 최상단 높이 

    for(int i = 0; i < depth; i++){
        top_arr.push_back(depth);   // 가장 낮은 위치로 초기화
        for(int j = 0; j < board.size(); j++){
            if(board[j][i] != 0){   // 인형이 존재할 때
                top_arr[i] = j;     // 해당 열 최상단 높이 변경
                break;
            }
        }
    }

    return top_arr;
}

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;                 // 제거된 인형 수
    vector<int> top = {};           // 각 열의 최상단 높이 
    vector<int> basket = {};        // 인형이 담기는 바구니

    top = getTopOfBoard(board);     // 최상단 높이 구하기

    for(int i = 0; i < moves.size(); i++){
        int x = moves[i] - 1;       // 크레인 위치
        int y = top[x];             // 뽑을 수 있는 높이
        int doll = board[y][x];     // 뽑은 인형

        if(doll == 0){              // 뽑을 인형이 없을때
            continue;               // 다음 단계로
        }

        if(basket.empty() || basket.back() != doll){
                                    // 바구니가 비었거나 바구니 맨 위 인형과 일치하지 않을 때
            basket.push_back(doll); // 바구니에 인형 추가
        }
        else{                       // 바구니 맨 위에 있는 인형과 일치할 때
            basket.pop_back();      // 바구니 맨 위 인형 제거
            answer += 2;            // 제거된 인형수 + 2
        }
        
        board[y][x] = 0;            // 인형 뽑은 위치 빈공간으로 

        if(board[0].size() - 1 > top[x]){
            top[x]++;               // 뽑기 가능 높이 업데이트
        }
    }

    return answer;
}

