class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inStack = new int[numCourses];

        for(int i =0 ; i < numCourses ; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pair : prerequisites){
            int course = pair[0];
            int prereq = pair[1];

            graph.get(prereq).add(course);
            inStack[course]++;


        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < numCourses ; i++){
            if(inStack[i] == 0) queue.offer(i);
        }

        int vis = 0;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            vis++;

            for(int neg : graph.get(curr)){
                inStack[neg]--;
                if(inStack[neg] == 0  ) queue.offer(neg); 
            }
        }

        return vis == numCourses;
        
        
    }

    
}