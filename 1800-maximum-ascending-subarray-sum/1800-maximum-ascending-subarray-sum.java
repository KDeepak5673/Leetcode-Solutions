class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            
            if( i == 0 || nums[i] > nums[i-1]){
                count = count + nums[i];
                 sum = Math.max(sum , count);
                
            }else{
               
                count = nums[i];
            }
        }

        return sum;
    }
}