# 4_Two_to_add
```java
class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        //1 stage
        answer = answer.toLowerCase();

        //2 stage
        // 숫자, 소문자, ".", "_", "-" 문자가 아닌것을 공백으로 치환한다.
        answer = answer.replaceAll("[^0-9a-z._-]","");


        //3 stage
        answer = answer.replaceAll("[.]+",".");

        //4 stage
        if (answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }
        if (answer.length()-1 != -1 && answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0,answer.length()-1);
        }

        //5 stage
        if (answer.length() == 0){
            answer = "a";
        }

        //6 stage
        if (answer.length() > 15){
            answer = answer.substring(0,15);
        }
        if (answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0,answer.length()-1);
        }

        //7 stage
        if (answer.length() < 3){
           String last = answer.substring(answer.length()-1);
            while (answer.length() < 3){
                answer = answer.concat(last);
            }
        }

        return answer;
    }
}
```
# 설명
정규표현식을 활용하여 문자열을 수정했다.

---
문제자체는 쉽지만,
정규표현식이 익숙치 않아 헤맨 문제 실제로 나올 경우 시간초과할 가능성 다분