# 19. 문자열 내 p와 y의 개수

## 문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.   

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.



## 입출력 예
s | result
--|-------
"pPoooyY" | true
"Pyy" | false

### 제한 조건
- 문자열 s의 길이 : 50 이하의 자연수
- 문자열 s는 알파벳으로만 이루어져 있습니다.

## 변수 및 함수
### 매개변수
    string: 대소문자가 섞여있는 문자열

### 새로 정의 한 변수
    pCounter: p 개수 카운터
    yCounter: y 개수 카운터

## 풀이
문자열을 소문자로 만든 후 `'p'` 일 경우 `pCounter++;` , `'y'`일 경우 `yCounter++;` 해준 후 pCounter 와 yCounter가 같은지 비교한다.