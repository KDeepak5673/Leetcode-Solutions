class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length ;

        int sum = 0 ;
        for(int i : nums){
            sum += i;
        }

        int expect = 0;

        for(int i = 0 ; i <= n ; i++){
            expect += i;
        }
        
        return expect - sum;
    }
    
}