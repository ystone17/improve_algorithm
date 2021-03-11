def solution(n, lost, reserve):
    students = {i: 1 for i in range(1, n + 1)}
    for s_lost in lost:
        students[s_lost] -= 1
    for s_reserve in reserve:
        students[s_reserve] += 1
    answer = 0
    for student, inventory in students.items():
        if inventory == 0:
            if students.get(student - 1) == 2:
                answer += 1
            elif students.get(student + 1) == 2:
                answer += 1
                students[student + 1] = 1
        else:
            answer += 1
    return answer