class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        //1 stage
        answer = answer.toLowerCase();

        //2 stage
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