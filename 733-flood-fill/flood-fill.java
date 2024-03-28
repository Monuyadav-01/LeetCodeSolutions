class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int initialColor = image[sr][sc];


        int delRow[] = { -1, 0, 1, 0 };
        int delCol[] = { 0, -1, 0, 1 };

        dfs(sr, sc, color, initialColor, image, delRow, delCol);

        return image;
    }
     private  void dfs(int row, int col, int newColor, int initialColor, int[][] image, int[] delRow,
            int[] delCol) {
        image[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for (int i = 0; i < 4; i++) {
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];

            if (nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && image[nRow][nCol] == initialColor
                    && image[nRow][nCol] != newColor) {
                dfs(nRow, nCol, newColor, initialColor, image, delRow, delCol);
            }
        }
    }
}