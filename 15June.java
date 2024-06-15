//Mobile numeric keypad
/*
There is a standard numeric keypad on a mobile phone. You can only press the current button or buttons that are directly up, 
left, right, or down from it (for ex if you press 5, then pressing 2, 4, 6 & 8 are allowed). Diagonal movements and pressing 
the bottom row corner buttons (* and #) are prohibited.

Given a number n, find the number of possible unique sequences of length n that you can create by pressing buttons.
You can start from any digit.
  */

// CODE
class Solution {
    int[][] dirs = {{-1, 0}, {1,0}, {0,1}, {0,-1}, {0,0}};
    Long dp[][][] = new Long[4][3][26];
    StringBuilder sb = new StringBuilder();
    
    public long getCount(int n) {
        int[][] mat = new int[4][3];
       
        int k = 1;
        long ans = 0;
        
        mat[3][0] = -1;
        mat[3][2] = -1;
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
              
                ans += solve(i, j, n-1, mat);
               
            }
            
        }
        ans += solve(3,1,n-1,mat);
        return ans;
    }
    
    public long solve(int i, int j, int n, int[][] mat)
    {
        if(n == 0) 
        {
         
            return 1;
        }
        
        if(dp[i][j][n] != null)
        return dp[i][j][n];
        
        long ans = 0;
        
        for(int[] dir: dirs)
        {
            int nr = i+dir[0], nc = j+dir[1];
            if(nr>=0 && nr<4 && nc>=0 && nc<3 && mat[nr][nc] != -1)
            {
            
                ans += solve(nr, nc, n-1, mat);
          
            }
            
        }
        return dp[i][j][n] = ans;
    }
}
