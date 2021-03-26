class Solution {
    public String solution(String phone_number) {
        int star_size = phone_number.length() - 4;
        String answer = new String(new char[star_size]).replaceAll("\0", "*");;

        return answer.concat(phone_number.substring(star_size));
    }
}