package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersOfString {
    public static void main(String[] args){
        String input = "Hello, my name is Yahia Salah Eldin Ali Ali. Nice to meet you!";

        Map<Character,Integer> chars=new HashMap<Character,Integer>();

        for (char c:input.toCharArray()){
            if(!chars.containsKey(c)){
                chars.put(c,0);
            }
            chars.put(c,chars.get(c)+1);
        }

        System.out.println("The characters count for: "+input);
        for(var c:chars.entrySet()){
            System.out.println(c.getKey()+" is found "+c.getValue()+(c.getValue()>1?" times.":" time."));
        }
    }
}
