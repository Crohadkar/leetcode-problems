class Solution {
    public int numIslands(char[][] grid) {
        int ans =0 ;
        
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    clearLands(grid,i,j);
                }
            }
        }
        return ans;
    }
    
    public void clearLands(char[][] grid ,int i , int j){
        if(i<0 ||j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0')return ;
        
        grid[i][j]='0';
        
        clearLands(grid,i+1,j);
        clearLands(grid,i-1,j);
        clearLands(grid,i,j+1);
        clearLands(grid,i,j-1);
        
        return ;
    }
}