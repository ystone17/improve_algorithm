int[] solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0 ; i< numbers.length-1; i++){
            for (int j = i + 1 ; j < numbers.length; j++) {
             result.add(numbers[i] + numbers[j]);
            }
        }

        TreeSet<Integer> treeSet = new TreeSet<>(result);
        result = new ArrayList<>(treeSet);
        int[] answer = result.stream().mapToInt(i->i).toArray();



        return answer;
    }