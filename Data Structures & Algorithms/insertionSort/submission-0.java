// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {

        List<List<Pair>> res = new ArrayList<>(); // this stores the intermediate states of array

        for (int i = 0; i < pairs.size(); i++) {
            int j = i - 1;

            // move elements that are greater than key one position ahead
            while (j >= 0 && pairs.get(j).key > pairs.get(j + 1).key) {
                Pair temp = pairs.get(j);
                pairs.set(j, pairs.get(j + 1));
                pairs.set(j + 1, temp);
                j--;
            }

            // clone and save the entire state of the array at this point
            List<Pair> cloneList = new ArrayList<>(pairs);
            res.add(cloneList);
        }

        return res;
    }
}
