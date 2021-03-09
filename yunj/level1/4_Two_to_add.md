# 4_Two_to_add
```
TreeSet<Integer> treeSet = new TreeSet<>(result);  
result = new ArrayList<>(treeSet);  
int[] answer = result.stream().mapToInt(i->i).toArray();
```

ArrayList result를 treeset으로 바꾸면, treeset 특성에 의해서 정렬이되며, 중복 값이 삭제된다. 

그것을 stream을 이용해 배열로 다시 바꾸어준다. 

ArrayList와 treeSet은 collection을 상속받아 변환이 가능하다.