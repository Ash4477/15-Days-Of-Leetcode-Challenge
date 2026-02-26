class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int totalProduct = nums[0];
        result[0] = 1;
        
        for (int i=1; i<len-1; i++) {
            result[i] = (totalProduct);
            System.out.println(i + " : " + result[i]);
            totalProduct *= nums[i];
        }

        result[len-1] = totalProduct;
        totalProduct = nums[len-1];

        for (int i=len-2; i>=0; i--) {
            result[i] *= totalProduct;
            System.out.println(i + " : " + result[i]);
            totalProduct *= nums[i];
        }

        return result;
    }
}