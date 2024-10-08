// 241. Different Ways to Add Parentheses

class Solution {
    public List<Integer> solve(String expression){
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left = solve(expression.substring(0, i));
                List<Integer> right = solve(expression.substring(i+1));
                for(int leftval: left){
                    for(int rightval: right){
                        if(ch == '+'){
                            ans.add(leftval + rightval);
                        }
                        else if(ch == '-'){
                            ans.add(leftval - rightval);
                        }
                        else{
                            ans.add(leftval * rightval);
                        }
                    }
                }
            }
        }
        if(ans.size() == 0){
            ans.add(Integer.parseInt(expression));
        }
        return ans;
    }
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
}