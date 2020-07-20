package com.ljc;

public class fourty_six {
    public int translateNum(int num) {
        Integer a=num;
        String str=a.toString();
        int n=str.length();
        int[] b=new int[n];
        int[] c=new int [n];
        for (int i=0;i<n;i++){
            b[i]=str.charAt(i)-48;
        }
        if(n==1) {
            c[0] = 1;
        }else if(n==2){
            c[0]=1;
            c[1]=1;
            if (b[0]*10+b[1]<=25){
                c[1]=2;
            }
        }else {
            c[0]=1;
            c[1]=1;
            if (b[0]*10+b[1]<=25){
                c[1]=2;
            }
            for (int i=2;i<n;i++){
                if (b[i-1]*10+b[i]<=25&&b[i-1]!=0){
                    c[i]=c[i-1]+c[i-2];
                }else{
                    c[i]=c[i-1];
                }
            }

        }

        return c[n-1];
    }
}
