p_1 = [1, 2, 3, 4, 5]  # 1번 수포자
p_2 = [2, 1, 2, 3, 2, 4, 2, 5]  # 2번 수포자
p_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]  # 3번 수포자


def check_answer(pattern, answers) -> int:
    count = 0
    p_len = len(pattern)
    for i, v in enumerate(answers):
        if v == pattern[i % p_len]:
            count += 1
    return count


def solution(answers):
    result = []
    p1 = check_answer(p_1, answers)
    max_val = p1
    result.append(1)

    p2 = check_answer(p_2, answers)

    if p2 > max_val:
        max_val = p2
        result.pop()
        result.append(2)
    elif p2 == max_val:
        result.append(2)

    p3 = check_answer(p_3, answers)

    if p3 > max_val:
        result.pop()
        result.append(3)
    elif p3 == max_val:
        result.append(3)

    return result




