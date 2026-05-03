class Solution {

    public String encode(List<String> strs) {
        // if list is empty, return empty string
        if (strs.isEmpty()) {
            return "";
        }

        // create empty list to store sizes of each string
        List<Integer> sizes = new ArrayList<>();

        // for each string in list, append length to size list
        for (String s : strs) {
            sizes.add(s.length());
        }

        // build string by writing size separated by comma
        StringBuilder encodedString = new StringBuilder();
        for (int i = 0; i < sizes.size(); i++) {
            encodedString.append(sizes.get(i) + ",");
        }

        // add # to mark end of size section
        encodedString.append("#");

        // append all strings in order
        for (String s : strs) {
            encodedString.append(s);
        }

        // return encoded string
        // System.out.println(encodedString.toString());
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        // if list is empty, return empty
        if (str.isEmpty()) {
            return new ArrayList<String>();
        }

        // separate numbers from strings
        int separator = str.indexOf("#");
        String lengthStr = str.substring(0, separator);

        // get sizes list
        List<Integer> sizes = new ArrayList<>();
        String cur = new String();

        for (int i = 0; i < separator; i++) {
            if (str.charAt(i) != ',') {
                cur += lengthStr.charAt(i);
            } else {
                sizes.add(Integer.parseInt(cur.toString()));
                cur = "";
            }
        }

        // use sizes list to separate strings
        int index = separator + 1;
        String strings = str.substring(index, str.length());
        List<String> decoded = new ArrayList<>();

        for (int i : sizes) {
            decoded.add(str.substring(index, index + i));
            index += i;
        }

        return decoded;
    }
}
