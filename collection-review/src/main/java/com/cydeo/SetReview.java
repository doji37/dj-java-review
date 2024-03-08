package com.cydeo;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        // 1. Create a set
        Set<Student> mySet = new HashSet<>();

        // 2. Add element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));

        System.out.println(mySet);
        // Will add duplicate to set if Override hashCode is not implemented
        System.out.println(mySet.add(new Student(9, "Muhabbet")));


        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        // Set does not allow duplicate values
        System.out.println(numSet.add(2));

        // Find first repeating char in a String
        // Steps: Create hashset, iterate, add chars to hashset, if false (duplicate val) return char
        System.out.println("First repeating character is: "+ firstRepeatingCharacter("java developer"));



    }

    public static Character firstRepeatingCharacter(String str){
        // Create a hashmap
        Set<Character> chars = new HashSet<>();

        // Iteration return ch if add returns false
        for(Character ch:str.toCharArray()){
            if(!chars.add(ch))
                return ch;

        }
        return null;
    }
}
