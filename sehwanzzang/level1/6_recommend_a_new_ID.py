from collections import deque
ASC_a = ord('a')  # 97
ASC_z = ord('z')  # 122

ASC_0 = ord('0')  # 48
ASC_9 = ord('9')  # 57

ASC_hipen = ord('-')  # 45
ASC_underbar = ord('_')  # 95
ASC_dot = ord('.')  # 46


def is_small_letter(c: str) -> bool:
    if 96 < ord(c) < 123:
        return True
    else:
        return False


def is_number(c: str) -> bool:
    if 47 < ord(c) < 58:
        return True
    else:
        return False


def is_other_letter(c: str) -> bool:
    n = ord(c)
    if (n == 45) or (n == 95) or (n == 46):
        return True
    else:
        False


def check_dot(new_id: str) -> bool:
    if new_id[0] == '.' or new_id[-1] == '.':
        return False
    for idx in range(len(new_id)):
        if idx == 0:
            continue
        if new_id[idx] == '.' and new_id[idx - 1] == '.':
            return False
    return True


def is_ok(new_id: str):
    if len(new_id) < 3 or len(new_id) > 15:
        return False
    if not check_dot(new_id):
        return False
    for char in new_id:
        if is_small_letter(char) or is_number(char) or is_other_letter(char):
            return True
        else:
            return False

def change_id(new_id:str):
    #소문자로 치환
    step_1 = new_id.lower()
    print("step 1", step_1)

    tmp = list(step_1)
    step_2 = []
    length = len(tmp)
    #이상한 문자 제거
    for idx in range(length):
        c = tmp[idx]
        if is_small_letter(c) or is_number(c) or is_other_letter(c):
            step_2.append(c)
        else:
            continue
    print("step 2", "".join(step_2))

    # 마침표가 2번이상 연속되면 하나의 마침표로 치환
    step_3 = []
    length = len(step_2)
    for idx in range(length):
        if idx == 0:
            step_3.append(step_2[idx])
            continue
        if step_3[-1] == '.' and step_2[idx] == '.':
            continue
        step_3.append(step_2[idx])
    print("step 3", "".join(step_3))
    #마침표가 처음이나 끝에 위치한다면 제거
    step_4 = deque(step_3)
    if len(step_4) == 1 and step_4[0] == '.':
        step_4.pop()
    else:
        if step_4[0] == '.':
            step_4.popleft()
        if step_4[-1] == '.':
            step_4.pop()

    print("step 4", "".join(list(step_4)))

    # 빈 문자열일경우 new_id에 'a'를 대입
    if len(step_4) == 0:
        step_4.append('a')

    print("step 5", "".join(list(step_4)))

    # new_id가 16자 이상이면 new_id의 첫 15개를 제외하고 모두 제거
    while True:
        if len(step_4) >= 16:
            step_4.pop() #오른쪽부터 제거
        else:
            break
    #제거 후  .가 new_id의 마지막에 위치하면 . 제거
    if step_4[-1] == '.':
        step_4.pop()
    print("step 6", "".join(list(step_4)))

    # 2자 이하면 반복
    if len(step_4) < 3:
        while True:
            if len(step_4) > 2:
                break
            step_4.append(step_4[-1])
    print("step 7", "".join(list(step_4)))

    return "".join(list(step_4))

def solution(new_id):
    if is_ok(new_id):
        return new_id
    else:
        return change_id(new_id)


# if __name__ == "__main__":
#     print(is_ok("z-+.^."))
