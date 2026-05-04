class Solution {
    public int islandPerimeter(int[][] grid) {
        int peri = 0;
        int a = grid.length;
        int b = grid[0].length;
        for(int i=0 ; i<a ; i++){
            for(int j=0 ; j<b ; j++){
                if(grid[i][j] == 1){
                    peri += 4;
                    if(i>0 && grid[i-1][j] == 1){
                        peri -= 2;
                    }
                    if(j>0 && grid[i][j-1] == 1){
                        peri -= 2;
                    }
                }
                
            }
        }
        return peri;
    }
}
