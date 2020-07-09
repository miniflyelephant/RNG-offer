package com.ljc;

public class four {
    public boolean findNumberIn2DArray(int[][] matrix,int target) {

        boolean b=false;
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return b;
        }
        int i=0,j=matrix[0].length-1;
        int a=0;
        while (j>=0&&i<matrix.length){
            if (matrix[i][j]==target){
                b=true;
                break;
            }
            if (matrix[i][j]>target){
                j--;
            }
            if (matrix[i][j]<target){
                i++;
            }
        }
        return b;
    }
}
