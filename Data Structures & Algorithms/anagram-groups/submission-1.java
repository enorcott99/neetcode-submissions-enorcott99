class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create hashmap
        Map<String, List<String>> res = new HashMap<>();
        
        for (String s : strs) {
            // sort each s
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            // put new key into hashmap if not already there
            res.putIfAbsent(sortedS, new ArrayList<>());

            // add value to key
            res.get(sortedS).add(s);
        }

        // convert hashmap into new arraylist
        return new ArrayList<>(res.values());
    }   
}
