//386. Lexicographical Numbers

class Solution {
    public void solve(int currnum, int n, ArrayList<Integer> anslist){
        if(currnum > n) return;
        // valid num add into your list
        anslist.add(currnum);
        // go in depth of the currnum if it is valid i.e. performing DFS
        for(int append = 0; append <= 9; append++){
            int newnum = (currnum * 10) + append;
            if(newnum > n) return;
            solve(newnum, n, anslist);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> anslist = new ArrayList<>();
        for(int startnum =1; startnum <= 9; startnum++){
            solve(startnum, n, anslist);
        }
        return anslist;
    }
}