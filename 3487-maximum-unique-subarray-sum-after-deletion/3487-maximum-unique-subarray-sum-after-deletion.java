class Solution {
    public int maxSum(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > 0){set.add(nums[i]);}
        }

        if(set.isEmpty()){
            return Arrays.stream(nums).max().getAsInt();
        }
        return set.stream().mapToInt(Integer::intValue).sum();
    }
}