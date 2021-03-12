def solution(s):
    def is_odd(n: int) -> int:
        return n % 2
    h = len(s) // 2
    if is_odd(len(s)):
        return s[h]
    else:
        return s[h-1:h+1]
    return answer
