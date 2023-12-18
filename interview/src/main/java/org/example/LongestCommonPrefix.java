package org.example;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        String currentPrefix=strs[0];

        for(int j=0;j<currentPrefix.length();j++)
        {
            int count = 1;

            for(int i=1;i<strs.length;i++)
            {
                if(j<strs[i].length()&&strs[i].charAt(j)==currentPrefix.charAt(j))
                {
                    count++;
                }
            }

            if(count==strs.length)
                prefix+=currentPrefix.charAt(j);
            else
                break;
        }

        return prefix;
    }
}
