```python3
def solution(participant, completion):
    p = participant
    for name in completion:
        p.remove(name)
    return p[0]
 
```

내장 메서드 remove를 이용해서 단순히 두 배열을 비교해서 빼기했다.