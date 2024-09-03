//1894. Find the Student that Will Replace the Chalk

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i =0; i < chalk.length; i++){
            sum += chalk[i];
            if(sum > k){
                break;
            }
        }
        int remainingchalks = (int)(k % sum);
        for(int i =0; i < chalk.length; i++){
            if(remainingchalks < chalk[i]){
                return i;
            }
            remainingchalks -= chalk[i];
        }
        return -1;
        
        
        
        /*while(k > 0){
            for(int i =0; i < chalk.length; i++){
                if(k < chalk[i]){
                    return i;
                }
                 k-= chalk[i];
            }
        }
        return 0;*/
    }
}