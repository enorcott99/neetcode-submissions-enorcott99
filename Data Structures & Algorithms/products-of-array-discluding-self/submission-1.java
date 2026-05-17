class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int product;
        for (int i = 0; i < nums.length; i++) {
            // pick starting value
            // if it is the first iteration, start will be second in list
            if (i == 0) {
                product = nums[1];
            // otherwise start will be first in list
            } else {
                product = nums[0];
            }

            // System.out.println(product);

            // start at 1 because start has already been taken into consideration
            for (int j = 1; j < nums.length; j++) {
                if (i == 0 && j == 1) {
                    product = product;
                } else if (i != j) {
                    product *= nums[j];
                }
                // System.out.println(product);
            }

            results[i] = product;
            // System.out.println();
        }

        return results;
    }
}  
