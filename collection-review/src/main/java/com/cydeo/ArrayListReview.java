package com.cydeo;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // create ArrayList of students
        List<Student> studentList = new ArrayList<>();

        // add students to ArrayList
        studentList.add(new Student(1, "Jose"));
        studentList.add(new Student(2, "Sayed"));
        studentList.add(new Student(3, "Nick"));
        studentList.add(new Student(4, "Ronnie"));
        System.out.println(studentList);

        // Iteration on ArrayList
        // 1. Use legacy for loop
        System.out.println("Using legacy for loop-------------");
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("Using Iterator-------------");
        // 2. Use Iterator
        // Forward iteration
        // List is able to implement Iterable because List extends Iterable.
        // Iterable -> Collections -> List
        Iterator iter = studentList.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Backward iteration
        System.out.println("Backward Iterator-------------");
        while(((ListIterator<?>)iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        // 3. forEach loop
        System.out.println("forEach loop-------------");
        for(Student each : studentList){
            System.out.println(each);
        }

        // 4. Lambda expression
        System.out.println("forEach loop w/ Lambda expression-------------");
        studentList.forEach(student -> System.out.println(student));

        // Sort elements in list
        System.out.println("Printing w/ sorted List by comp-------------");
        Collections.sort(studentList, new sortByIdDesc());
        System.out.println(studentList);

        System.out.println("Printing w/ sorted List by comp name-------------");
        Collections.sort(studentList, new sortByNameDesc());
        System.out.println(studentList);





    }
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
