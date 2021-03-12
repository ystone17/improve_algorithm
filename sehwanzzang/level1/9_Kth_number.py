def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        start, end, kth = map(int, commands[i])
        new_arr = array[(start - 1): end]
        new_arr.sort()
        answer.append(new_arr[kth-1])
    return answer
