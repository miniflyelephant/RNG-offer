package com.ljc;

public class a49 {
    public int nthUglyNumber(int n) {
        int[] num=new int[n+5];
        int min;
        int a,b,c;
        int q,w,e;
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        a=3;
        b=1;
        c=1;
        if(n<=5){
            return num[n];
        }
        for (int i=5;i<n;i++){
            q=2*num[a];
            w=3*num[b];
            e=5*num[c];
            min=q;
            for (int j=0;j<2;j++){
                if(q<w&&q<e){
                    a=i;
                    num[i]=q;
                }
                if (w<q&&w<e){
                    b=i;
                    num[i]=w;
                }
                if(e<q&&e<w){
                    c=i;
                    num[i]=e;
                }
            }

        }
        return num[n];
    }
}
