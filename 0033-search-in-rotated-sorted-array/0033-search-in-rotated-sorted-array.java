class Solution {
    public int search(int[] nums, int target) {

        int pivot = Ans(nums);
        

        if (pivot == -1) {
            // just do normal binary search
            return Solution(nums, target, 0 , nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }

         if (target >= nums[0]) {
            return Solution(nums, target, 0, pivot - 1);
        }

        return Solution(nums , target , pivot+1 , nums.length-1);

    }   
    int Ans(int[] arr){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end ){
            int mid = start + ( end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if(start == end ){
            return start;
        }

        return -1;
    }

    

    int Solution(int[ ] array , int tar , int start , int end ){

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(array[mid] == tar){
                return mid;

            }else if(array[mid] > tar){
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return -1;

    }


}