class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Out = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++){
            Out.put(nums[i] , i);
        }


        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (Out.containsKey(y)){
                if(Out.get(y) == i)continue;
                return new int[] {Out.get(y) , i };
            }
            

        }
        return new int[]{};

    }
}