package com.ljc;

public class a13 {
    public int movingCount(int m, int n, int k) {
        int count=0;
        int[][] num=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                num[i][j]=i/10+i%10+j/10+j%10;
            }
        }
        count=dfs(num,m,n,k,0,0);
        return count;
    }

    public int dfs(int[][] num,int m,int n,int k,int i,int j){
        if (i<0||i>=m||j<0||j>=n||num[i][j]>k||num[i][j]<0){
            return 0;
        }
        int count=1;
        int temp=num[i][j];
        num[i][j]=-1;
        count=count+dfs(num,m,n,k,i+1,j)+dfs(num,m,n,k,i,j+1)+
                dfs(num,m,n,k,i-1,j)+dfs(num,m,n,k,i,j-1);

        return count;
    }

}
