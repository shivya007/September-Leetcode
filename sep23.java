// 2707. Extra Characters in a String
class Solution {
    public int minExtraChar(String s, String[] dict) {
 int n = s.length();
        Set<String> st = new HashSet<>();
        for (String word : dict) {
            st.add(word); // Adding each element from the array to the set
        }

        int[] t = new int[n + 1]; // DP array
        // t[i] = min extra characters in s from index i to index n-1
        // we want to return t[0]

        for (int i = n - 1; i >= 0; i--) {
            t[i] = 1 + t[i + 1]; // skipping the ith character

            for (int j = i; j < n; j++) {
                String curr = s.substring(i, j + 1);
                if (st.contains(curr)) {
                    t[i] = Math.min(t[i], t[j + 1]); // solve(j+1)
                }
            }
        }

        return t[0];
    }
}