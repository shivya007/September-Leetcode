//1945. Sum of Digits of String After Convert

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(String.valueOf(c-'a'+1));
        }
        String ans = sb.toString();
        for(int i =0; i < k; i++){
            int sum = 0;
            for(char c: ans.toCharArray()){
                sum += (c - '0');
            }
            ans = String.valueOf(sum);
        }
        return Integer.parseInt(ans);
    }
}