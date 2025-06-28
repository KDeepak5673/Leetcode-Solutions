class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int[] arr = new int[k];

        Arrays.sort(nums);

        for(int i = 0 , j = nums.length-1 ; i < arr.length ; i++ , j--){
            arr[i] = nums[j];
        }
        Arrays.sort(arr);
        return arr;

    }
}