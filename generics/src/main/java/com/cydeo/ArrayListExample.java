package com.cydeo;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

//        Will not run into compile errors trying to add "apple". Will have runtime error if using generic ArrayList
//        items.add("apple");

        printDouble(items);

    }

    private static void printDouble(ArrayList<Integer> items) {

//        Need to cast it using (Integer) if using generic ArrayList
//        for(Object i : items){
//            System.out.println((Integer)i * 2);
//        }

        for(int i : items){
            System.out.println(i * 2);
        }
    }
}
