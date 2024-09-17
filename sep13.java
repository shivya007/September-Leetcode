//310. XOR Queries of a Subarray

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i =0; i < queries.length; i++){
            int fidx = queries[i][0];
            int lidx = queries[i][1];
            int xor = 0;
            for(int j = fidx; j <= lidx; j++){
                xor = xor^arr[j]; 
            }
            ans.add(xor);
        }
        int[] ansfinal = new int[ans.size()];
        for(int i =0; i < ansfinal.length; i++){
            ansfinal[i] = ans.get(i);
        }
        return ansfinal;
    }
}