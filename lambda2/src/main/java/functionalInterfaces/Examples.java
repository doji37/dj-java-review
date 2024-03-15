package functionalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args){

        // Predicate
        Predicate<Integer> lesserThan = number -> number<10;
        System.out.println(lesserThan.test(50));
        System.out.println(lesserThan.test(5));

        /*
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<10;
            }
        };
        lesserThan.test(50);
         */


        // Consumer
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);


        // BiConsumer
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x+y);
        addTwo.accept(100, 200);


        // Function
        Function<String, String> fun = s -> "Hello " + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);
        System.out.println(fun.apply("Steve"));


        // Supply
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



    }
}
