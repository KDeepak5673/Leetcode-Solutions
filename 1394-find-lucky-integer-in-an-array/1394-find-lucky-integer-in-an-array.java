class Solution {
    public int findLucky(int[] arr) {

        int max = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(findLucky(arr , arr[i])){
                max = Math.max(max , arr[i]);
            }

        }
        return max;
        
    }
    public boolean findLucky(int[] arr , int x) {

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        }

        return count == x;
        
    }
}