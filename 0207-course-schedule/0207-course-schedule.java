class Solution {
    public boolean isCycle(List<List<Integer>>list,boolean vis[],boolean stack[],int curr){
        vis[curr]=true;
        stack[curr]=true;
        for(int nbr:list.get(curr)){
            if(stack[nbr])return true;
            if(!vis[nbr]){
                if(isCycle(list,vis,stack,nbr))return true;
            }
        }
        stack[curr]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        boolean vis[]=new boolean[numCourses];
        boolean stack[]=new boolean[numCourses];
        for(int[]arr:prerequisites){
            list.get(arr[1]).add(arr[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(isCycle(list,vis,stack,i))return false;
            }
        }
        return true;
    }
}