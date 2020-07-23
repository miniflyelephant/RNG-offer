package com.day;

public class d64 {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] temp =new int [m][n];
        if(m==0){
            temp[m][0]=grid[m][0];
            for (int i=1;i<n;i++){
                temp[0][i]=grid[0][i]+temp[0][i-1];
            }
        }else if (n==0){
            temp[0][n]=grid[0][n];
            for (int i=1;i<m;i++){
                temp[i][0]+=grid[i][0]+temp[i-1][0];
            }
        }else {
            temp[0][0]=grid[0][0];
            for (int i=1;i<n;i++){
                temp[0][i]=grid[0][i]+temp[0][i-1];
            }
            for (int i=1;i<m;i++){
                temp[i][0]+=grid[i][0]+temp[i-1][0];
            }
            for (int i=1;i<m;i++){
                for (int j=1;j<n;j++){
                    temp[i][j]=Math.min(temp[i-1][j],temp[i][j-1])+grid[i][j];
                }
            }
        }
        return temp[m-1][n-1];
    }
}
