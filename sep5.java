//2028. Find Missing Observations


class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int ans[] = new int[n];
        int m = rolls.length;;
        int sum = 0;
        for(int i =0; i < m ; i++){
            sum += rolls[i];
        }
        int sumofnvalues= (mean * (n+m)) - sum;

        // This is a tricky part, which makes this question medium in difficulty.
        if(sumofnvalues < n || sumofnvalues > n*6){
            return new int[0];
        }
        Arrays.fill(ans, 1);
        int curranssum = n;
        for(int i =0; i < n && curranssum < sumofnvalues; i++){
            while(curranssum < sumofnvalues && ans[i] < 6){
                ans[i]++;
                curranssum++;
            }
        }
        return ans;
    }
}