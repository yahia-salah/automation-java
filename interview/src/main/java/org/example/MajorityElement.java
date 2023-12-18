package org.example;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        Map<Integer,Integer> counts = new HashMap<>();

        for(int num:nums){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }

        majorityElement = counts.entrySet().stream().filter(x->x.getValue()>nums.length/2.0).findFirst().get().getKey();

        return majorityElement;
    }
}
