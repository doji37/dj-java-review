package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class UserTest {

    public static void main(String[] args){

        List<User> userList = new ArrayList<>();
        userList.add(new User("Joe", "Egert", 10));
        userList.add(new User("John", "Doe", 55));
        userList.add(User.builder().firstName("Amy").lastName("Evan").age(35).build());
        userList.add(User.builder().firstName("Emma").lastName("Pellard").age(25).build());

        // Print all elements in the list
        printUser(userList, p -> true);

        /*
        Consumer<List> printUsers = user -> System.out.println(user.toString() + "\n");
        printUsers.accept(userList);
         */


        // Print all users with a last name that starts with E
        System.out.println("Print users w/ last name that starts with E--------------");
        printUser(userList, user -> user.getLastName().startsWith("E"));





    }

    private static void printUser(List<User> users, Predicate<User> p){
        for(User user : users) {
            if(p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }


}
