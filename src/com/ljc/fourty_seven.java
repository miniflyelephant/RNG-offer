package com.ljc;

public class fourty_seven {
    public int maxValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        int [][]a=new int[m][n];
        a[0][0]=grid[0][0];
        if (m==0){
            for (int i=1;i<n;i++){
                a[0][i]=grid[0][i]+a[0][i-1];
            }
        }
        else if (m==0){
            for (int i=1;i<n;i++){
                a[i][0]=grid[i][0]+a[i-1][0];
            }
        }else {
            for (int i=1;i<n;i++){
                a[0][i]=grid[0][i]+a[0][i-1];

            }
            for (int i=1;i<m;i++){
                a[i][0]=grid[i][0]+a[i-1][0];
            }
            for (int i=1;i<m;i++){
                for (int j=1;j<n;j++){
                    max=a[i-1][j];
                    if (a[i][j-1]>max){
                        max=a[i][j-1];
                    }
                    a[i][j]=max+grid[i][j];
                }
            }
        }


        return a[m-1][n-1];
    }
}
