//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        int ans = 0;
        for(int i =0; i < words.length; i++){
            int currstrcount = 0;
            String currstr = words[i];
            for(char c: currstr.toCharArray()){
                if(set.contains(c)){
                    currstrcount++;
                }
            }
            if(currstrcount == currstr.length()){
                ans++;
            }
        }
        return ans;
    }
}