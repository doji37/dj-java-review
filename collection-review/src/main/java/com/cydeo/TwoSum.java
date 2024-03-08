package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        // You can return the answer in any order.
        int[] myArray = {2, 7, 9, 11};
        System.out.println("Brute Force Solution ------------");
        System.out.println(Arrays.toString(twoSum(myArray, 9)));
        System.out.println("Optimal Solution ------------");
        System.out.println(Arrays.toString(twoSum2(myArray, 9)));

    }

    // Brute force solution
    public static int[] twoSum(int[] array, int target){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if((array[i] + array[j]) == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Optimal solution
    // 1. Use HashMap to iterate array and put each (value & index) to a map
    // 2. Start iteration again
    public static int[] twoSum2(int[] array, int target) {
        // Create HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array.
        // If potential match exists return that indeces else put array value and index to map
        for(int i = 0; i < array.length; i++){
            int potentialMatch = target - array[i];
            if(map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }

}

