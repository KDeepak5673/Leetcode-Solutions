class Solution {
    public int splitArray(int[] nums, int k) {
        

        int start = 0 ;
        int end = 0;

        for(int i = 0 ; i < nums.length ; i++){
            start = Math.max(start , nums[i]);
            end += nums[i];

        
        }
        while(start <= end ){

            int mid = start + (end - start ) / 2 ; 

            int sum = 0;
            int splits = 1;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    splits++;
                }else{
                    sum += num;
                }
            }

            if(splits > k){
                start = mid + 1 ;
            }else{
                end = mid -1;
            }

        }

        return start;
    }
}