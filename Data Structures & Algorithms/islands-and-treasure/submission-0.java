class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int INF = Integer.MAX_VALUE;
        for(int i = 0;i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 0){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.row;
            int col = p.col;
            int dist = p.dist;

            int [] drow = {0,0,1,-1};
            int [] dcol = {-1,1,0,0};
            for(int i = 0; i<4; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(ncol>=0 && ncol<n && nrow>=0 && nrow<m && grid[nrow][ncol] == INF){
                    grid[nrow][ncol] = dist+1;
                    q.add(new Pair(nrow,ncol,dist+1));
                }
            }
        }
    }
}

class Pair{
    int row;
    int col;
    int dist;
    public Pair(int row, int col, int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}