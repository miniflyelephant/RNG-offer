package com.ljc;
import java.util.HashSet;
import java.util.Set;

public class three {

    public int findRepeatNumber(int[] nums) {
        Set a=new HashSet();
        int b=-1;
        for(int i=0;i<nums.length;i++){
            boolean c=a.add(nums[i]);
            b=nums[i];
            if (c==false){
                return b;
            }
        }
        return -1;

    }

}
