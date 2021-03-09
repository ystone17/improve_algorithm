```python3
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
```

중복을 허용하지 않기 위해 `set` 자료형을 사용했고,

걍 이중 루프 돌면서 브루트 포스로 모든 값을 계산한다.

그러고 `list`로 타입을 바꾸고 내장 메서드인 sort()로 정렬해서 계산한다.

파이썬의 `sort` 내장 메서드는 `quick sort`이므로 엄청 빠르다. 정렬 할 때 그냥 쓰면 됨