class Solution {
    public int numIslands(char[][] grid) {

        if(grid== null || grid.length == 0){
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid ,i, j );
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int i , int j ){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '0';

        dfs(grid , i+1 , j);
        dfs(grid , i-1 , j);
        dfs(grid , i , j+1);
        dfs(grid , i , j-1);

    }

}