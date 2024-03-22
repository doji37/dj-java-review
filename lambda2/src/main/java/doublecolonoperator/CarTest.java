package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args){


        // Zero argument
        Supplier<Car> car1 = () -> new Car();
        System.out.println(car1.get().getModel());

        Supplier<Car> car2 = Car::new;
        System.out.println(car2.get().getModel());


        // One argument
        Function<Integer, Car> f1 = (model) ->  new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car bmw2 = f2.apply(2015);
        System.out.println(bmw.getModel());


        // Two arguments
        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        Car car3 = b1.apply("Honda", 2010);
        System.out.println(car3.toString());


        BiFunction<String, Integer, Car> b2 = Car::new;
        Car car4 = b2.apply("Toyota", 2024);
        System.out.println(car4.toString());
    }
}
