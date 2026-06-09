class island{
    static int diff[][]={{-1,0},{1,0},{0,-1},{0,1}};
   static void dfs(char grid[][],int r,int c,int row, int col){
        grid[row][col]='0';
        for(int i=0;i<4;i++){
            int ar= row+diff[i][0];
            int ac= col+diff[i][1];
            if(ar>=0 && ac>=0 && ar<r &&ac<c && grid[ar][ac]=='1'){
                dfs(grid, r, c, ar, ac);
            }
        }
    }
    static int numIsLand(char[][] grid){
        int r =grid.length;
        int c =grid[0].length;
        int islands=0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(grid[row][col]=='1'){
                islands++;
               dfs(grid, r, c, row, col);
                }  
            }

        }
 return islands;
}

 public static void main (String args[]){
    char grid[][]={{'1','1','0','0','0'},
                    {'1','1','0','0','0'},
                {'0','0','1','0','0'},
            {'0','0','0','1','1'}};
            System.out.println(numIsLand(grid));
 }
}