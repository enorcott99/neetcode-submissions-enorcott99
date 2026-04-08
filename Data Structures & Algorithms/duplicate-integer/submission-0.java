class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j++;
            }
        }

        return false;
    }
}