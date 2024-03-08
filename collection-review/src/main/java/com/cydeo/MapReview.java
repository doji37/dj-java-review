package com.cydeo;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        // Create HashMap
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Sergio");
        map.put(2, "Moses");
        System.out.println(map);
        System.out.println(map.get(2));

        // Find first non-repeating char in a String
        // ex. "Java Developer", output should be "J"
        // Steps: create HashMap, (ch, value count), iterate and count chars, revisit HashMap, and first first count = 1
        System.out.println(findFirstNonRepeating("deo java developer"));

    }

    public static Character findFirstNonRepeating(String str){
        Map<Character, Integer> map = new HashMap<>();
        // for counting the chars
        int count;

        // counting chars and putting values in the hash map
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            } else {
                map.put(ch, 1);
            }
        }

        // starting from String, check if the char count equals 1
        for(Character ch:str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return null;
    }

}
