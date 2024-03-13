package functionalInterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args){

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<10;
//            }
//        };
//        lesserThan.test(50);

        // Predicate
        Predicate<Integer> lesserThan = number -> number<10;
        System.out.println(lesserThan.test(50));
        System.out.println(lesserThan.test(5));

    }
}
