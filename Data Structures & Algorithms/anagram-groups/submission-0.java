class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<List<String>>();
        String[] sortedStrs = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            sortedStrs[i] = sortedString;
        }

        for (int i = 0; i < strs.length; i++) {
            List<String> testList = new ArrayList<String>();
            if (strs[i] != "") {
                testList.add(strs[i]);

                for (int j = i + 1; j < strs.length; j++) {
                    if (sortedStrs[i].equals(sortedStrs[j]) && strs[j] != "") {
                        testList.add(strs[j]);
                        strs[j] = "";
                    }
                }

                resultList.add(testList);
                strs[i] = "";
            }
        }

        return resultList;
    }
}
