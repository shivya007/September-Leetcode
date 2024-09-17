//1371. Find the Longest Substring Containing Vowels in Even Counts
class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int vowels[] = new int[5];
        String currstate = "00000";
        map.put(currstate, -1);
        int max= 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                vowels[0] = (vowels[0] + 1)%2;
            }
            else if(s.charAt(i) == 'e'){
                vowels[1] = (vowels[1] + 1) % 2;
            }
            else if(s.charAt(i) == 'i'){
                vowels[2] = (vowels[2] + 1) % 2;
            }
            else if(s.charAt(i) == 'o'){
                vowels[3] = (vowels[3] + 1) % 2;
            }
            else if(s.charAt(i) == 'u'){
                vowels[4] = (vowels[4] + 1) % 2;
            }
            currstate = "";
            for(int j =0; j < 5; j++){
                currstate += vowels[j];
            }
            if(map.containsKey(currstate)){
                max = Math.max(max, i - map.get(currstate));
            }
            else{
                map.put(currstate, i);
            }
        }
        return max;
    }
}