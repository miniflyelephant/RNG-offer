package com.day;

public class d392 {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int j=0;
        for (int i=0;i<n;i++){
            if (t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        if (j==m){
            return true;
        }

        return false;
    }
}
