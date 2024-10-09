//2416. Sum of Prefix Scores of Strings

class Solution {
    class TrieNode{
        int countp = 0;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){
            for(int i =0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    public TrieNode getTrieNode(){
        return new TrieNode();
    }
    public void insert(String word, TrieNode root){
        TrieNode crawl = root;
        for(char ch: word.toCharArray()){
            int idx = ch-'a';
            if(crawl.children[idx] == null){
                crawl.children[idx] = getTrieNode();
            }
            crawl.children[idx].countp += 1;
            crawl = crawl.children[idx];
        }
    }
    public int getScore(String word, TrieNode root){
        TrieNode crawl = root;
        int score = 0;
        for(char ch: word.toCharArray()){
            int idx = ch-'a';
            score += crawl.children[idx].countp;
            crawl = crawl.children[idx];
        }
        return score;
    }
    public int[] sumPrefixScores(String[] words) {
        int n = words.length;
        TrieNode root = getTrieNode();
        // Insert all words to trie
        for(String word: words){
            insert(word, root);
        }
        int[] result = new int[n];
        // calculate sum of prefix score for each word
        for(int i =0; i < n; i++){
            result[i] = getScore(words[i], root);
        }
        return result;
    }
}