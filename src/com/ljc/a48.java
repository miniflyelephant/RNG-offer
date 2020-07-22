package com.ljc;

import java.util.HashSet;
import java.util.Set;

public class a48 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        boolean check=false;
        int max=1;
        if (n==0){
            return 0;
        }
        char[] str=s.toCharArray();
        int [] count=new int[n];
        count[0]=1;
        Set<Character> temp=new HashSet<Character>();
        temp.add(str[0]);
        for (int i=0;i<n;i++){
            temp.add(str[i]);
            for (int j=i+1;j<n-i;j++){
                check=temp.add(str[i]);
                if (check==true){
                    count[i]=count[i-1]+1;
                    if (count[i]>max){
                        max=count[i];
                    }
                }else {
                    count[i]=1;
                    temp.clear();
                    break;
                }
            }
        }
        return max;
    }
}