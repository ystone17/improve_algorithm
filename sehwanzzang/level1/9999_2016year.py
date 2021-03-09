# 2016년 1월 1일은 금요일이다. 그리고 윤년

DAYS = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']

MONTH_DAYS = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def solution(a, b):
    days = -1
    if a != 1:
        for idx in range(1 ,a):
            days += MONTH_DAYS[idx-1]
    days += b
    answer = DAYS[days % 7]
    return answer
