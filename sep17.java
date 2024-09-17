//884. Uncommon Words from Two Sentences

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList<>();
        String combined = s1 +" " + s2;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map= new HashMap<>();
        for(int i =0; i < combined.length(); i++){
            char ch = combined.charAt(i);
            if(ch == ' '){
                String word = sb.toString();
                map.put(word, map.getOrDefault(word, 0) + 1);
                sb = new StringBuilder();
            }
            else{
                sb.append(ch);
            }
        }
        String lastWord = sb.toString();
        map.put(lastWord, map.getOrDefault(lastWord, 0) + 1);

        // simply check if anhy word has a frequency of 1
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);

       // brute force ka bhi brute force
        /*ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> map1= new HashMap<>();
        HashMap<String, Integer> map2= new HashMap<>();
        String[] s1parts = s1.split(" ");  //{this, apple, is sweet}
        String[] s2parts = s2.split(" ");
        for(int i =0; i < s1parts.length; i++){
            map1.put(s1parts[i], map1.getOrDefault(s1parts[i], 0) + 1);
        }
        for(int i =0; i < s2parts.length; i++){
            map2.put(s2parts[i], map2.getOrDefault(s2parts[i], 0) + 1);
        }
        Set<String> keyset1 = map1.keySet();
        for(String key: keyset1){
            if(map1.get(key) <= 1 && (!map2.containsKey(key))){
                result.add(key);
            }
        }
        Set<String> keyset2 = map2.keySet();
        for(String key: keyset2){
            if(map2.get(key) <= 1 && (!map1.containsKey(key))){
                result.add(key);
            }
        }
        String[] finalres = new String[result.size()];
        for(int i =0; i < finalres.length; i++){
            finalres[i] = result.get(i);
        }
        return finalres;*/
    }
}