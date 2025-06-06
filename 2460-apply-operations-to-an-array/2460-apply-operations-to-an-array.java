class Solution {
    public int[] applyOperations(int[] nums) {

        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < nums.length -1 ; i++){
            if( nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        int i = 0;
        for(int x : nums){
            if(x > 0){
                ans[i] = x;
                i++;
            }
        }

        return ans;
    }
}