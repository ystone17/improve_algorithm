# 최댓값 구하기


```sql
SELECT DATETIME FROM ANIMAL_INS ORDER BY DATETIME DESC LIMIT 1
```

우선 DATETIME 컬럼을 선택하고, `DATETIME` 칼럼 기준 오름차순으로 정렬하고
`LIMIT 1` 으로 하나만 출력한다.