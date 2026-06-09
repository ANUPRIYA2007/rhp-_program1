class Solution {

    int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

    private int dfs(int[][] matrix, int[][] dp, int row, int col) {

        if(dp[row][col] != 0)
            return dp[row][col];

        int maxPath = 1;

        for(int[] d : dir) {
            int nr = row + d[0];
            int nc = col + d[1];

            if(nr >= 0 && nr < matrix.length &&
               nc >= 0 && nc < matrix[0].length &&
               matrix[nr][nc] > matrix[row][col]) {

                maxPath = Math.max(maxPath,
                        1 + dfs(matrix, dp, nr, nc));
            }
        }

        dp[row][col] = maxPath;
        return maxPath;
    }

    public int longestIncreasingPath(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];

        int ans = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                ans = Math.max(ans, dfs(matrix, dp, i, j));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {9,9,4},
            {6,6,8},
            {2,1,1}
        };

        Solution obj = new Solution();

        System.out.println(obj.longestIncreasingPath(matrix));
    }
}