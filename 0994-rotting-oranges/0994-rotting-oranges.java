class Solution {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        
        int[][] vis = grid;

        Queue<int[]> q = new LinkedList<>();
        int countFreshOrange = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[] {i , j});
                }
                if(grid[i][j] == 1 ){
                    countFreshOrange++;
                }
                
            }
        }

        if(countFreshOrange == 0){
            return 0;
        }
        if(q.isEmpty()){
            return -1;
        }

        int min = -1;

        int[][] dirs = {{1,0}, {-1,0}, { 0, -1}, {0,1}};

        while(!q.isEmpty()){
            int size = q.size();

            while(size --> 0){
                int[] cell = q.poll();
                
                int x = cell[0];
                int y = cell[1];

                for(int[] dir : dirs){
                    int i = x + dir[0];
                    int j = y + dir[1];

                    if(i >= 0 && i < m && j >= 0 && j < n && vis[i][j] == 1){
                        vis[i][j] = 2;
                        countFreshOrange--;
                        q.offer(new int[]  {i , j});
                    }
                }

            }

            min++;
        }

        if(countFreshOrange == 0){
            return min;
        }

        return -1;


    }

    
}