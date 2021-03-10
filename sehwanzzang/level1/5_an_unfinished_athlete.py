def solution(participant, completion):
    p = participant
    for name in completion:
        p.remove(name)
    return p[0]
