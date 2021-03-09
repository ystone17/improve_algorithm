```python3
from collections import deque

def solution(board, moves):
    """
    :param board: N * N 의 2차원 배열
    :param moves: 크레인의 움직임
    :return: 몇개의 인형이 터져부렸는지
    """
    game_borad = board
    game_moves = deque([x - 1 for x in moves])
    stack = deque([])

    count = 0

    for _ in range(len(game_moves)):
        check_idx = game_moves.popleft()
        for i in range(len(game_borad)): #0, 1, 2, 3 ... N
            if game_borad[i][check_idx] != 0:
                stack.append(game_borad[i][check_idx])
                game_borad[i][check_idx] = 0
                break
            else:
                continue
        #앞에 들어온 인형과 현재 인형이 동일한지 체크
        if (len(stack) == 0) or (len(stack) == 1):
            continue
        if stack[len(stack) - 1] == stack[len(stack) - 2]:
            stack.pop()
            stack.pop()
            count += 2

    answer = count

    return answer

```

우선 로직은 매우 간단하다 (코드가 더러워서 그 렇 지)

board는 N * N 2차원 배열이구, moves는 1차원 배열이다.

moves는 몇번째 열에서 인형을 뽑겠다 라고 이야기하는 거고, 여기서 배열로 처리하기 위해 모든 원소를 - 1을 하는 로직을 넣음
`game_moves = deque([x - 1 for x in moves])`

moves가 가르키는 열에 인형이 없을경우 넘어가야하니까, 2차원 배열에서 `moves - 1`에 해당하는 모든 배열의 인덱스를 순회한다.
이 때 순회 조건은, 접근했을 때 0이면 다음 배열로 넘어가고, 0 이 아니면 인형을 쌓도록 로직을 박았다.

그리고 인형이 쌓인 스택에 인형이 2개 이상 있을때만 스택의 가장 위와 그 다음 원소가 같은 인형인지 비교해서
같은 인형이면 스택에서 빼내고, `count += 2`를 해가주구 계산한다.

끝