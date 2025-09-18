class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int[] ans = new int[k];

        // int max = Integer.MIN_VALUE;
        
        // for(int num : nums){
        //     max = Math.max(num, max);
        // }

        // int[] freq = 

        Map<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            map.putIfAbsent(num , 1);
            int key = map.get(num);
            map.put(num, key+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
        return res;

    }
}