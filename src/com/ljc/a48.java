package com.ljc;

import java.util.HashSet;
import java.util.Set;

public class a48 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        boolean check=false;
        int [] count=new int[n];
        int max=1;
        if (n==0){
            return 0;
        }
        char[] str=s.toCharArray();
        Set<Character> temp=new HashSet<Character>();
        for (int i=0;i<n;i++){
            count[i]=1;
            temp.add(str[i]);
            for (int j=i+1;j<n;j++){
                check=temp.contains(str[j]);
                if (check==false){
                    temp.add(str[j]);
                    count[j]=count[j-1]+1;
                    if (count[j]>max){
                        max=count[j];
                    }
                }else {
                    temp.clear();
                    break;
                }
            }
        }
        return max;
    }
}