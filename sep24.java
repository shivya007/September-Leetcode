//3043. Find the Length of the Longest Common Prefix

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int val : arr1){
            while(!set1.contains(val) && val > 0){
                set1.add(val);
                val = val/10;
            }
        }
        int result = 0;
        for(int val: arr2){
            while(!set1.contains(val) && val > 0){
                val = val/10;
            }
            if(val > 0) result = Math.max(result, (int) Math.log10(val) + 1);
        }
        return result;
    }
}