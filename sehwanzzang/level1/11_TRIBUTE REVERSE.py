import string

cv = string.digits + string.ascii_lowercase


def convert(num, base=3) -> str:
    q, r = divmod(num, base)
    if q == 0:
        return cv[r]
    else:
        return convert(q, base) + cv[r]


def reverse_tri(tribute: str) -> str:
    tmp = list(tribute)
    tmp.reverse()
    return "".join(tmp)


def solution(n):
    return int(reverse_tri(convert(n)), 3)


if __name__ == '__main__':
    print(solution(45))
