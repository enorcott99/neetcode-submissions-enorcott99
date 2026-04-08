class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        while (k != 0) {
            // find most frequent num
            int mostFrequent = -1;
            int highestCount = 0;
            for (int i = 0; i < nums.length; i++) {
                int count = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > highestCount) {
                    mostFrequent = nums[i];
                    highestCount = count;
                }

            }

            // add to answer array
            answer[k - 1] = mostFrequent;

            // remove num from original array
            int[] newArray = new int[nums.length - highestCount];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != mostFrequent) {
                    newArray[j] = nums[i];
                    j++;
                }
            }

            nums = newArray;

            // subtract from k
            k--;
        }

        return answer;
    }
}
