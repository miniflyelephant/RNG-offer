package com.ljc;

import java.util.Stack;

public class a31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int m=pushed.length;
        int n=popped.length;
        boolean check=false;
        if (pushed==null||popped==null||popped.length==0||pushed.length==0){
            return true;
        }
        Stack<Integer> stack=new Stack<Integer>();
        int j=0;
        for (int i=0;i<m+n;i++){
            if (j==n){
                check=true;
                break;
            }
            if (i==m){
                i=i-1;
                if (popped[j]==stack.peek()){
                    stack.pop();
                    j++;
                }else {
                    break;
                }
            }else {
                if (stack.size()!=0&&popped[j]==stack.peek()){
                    stack.pop();
                    j++;
                    i--;
                    continue;
                }
                stack.push(pushed[i]);
            }

        }

        return check;
    }
}
