package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> counts = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            counts.put(nums[i], counts.getOrDefault(nums[i],0)+1);
        }

        return counts.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList());
    }
}
