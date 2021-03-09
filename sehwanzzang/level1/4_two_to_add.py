def solution(numbers: list):
    #시간복잡도 신경 안쓰고 졸라리 쉽게 풀도록 하겠다.
    #부루투 포스
    tmp = set()
    for i in range(len(numbers)):
        for v in range(len(numbers)):
            if v == i:
                continue
            else:
                tmp.add(numbers[i] + numbers[v])

    answer = list(tmp)
    answer.sort()
    return answer