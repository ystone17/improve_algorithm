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
