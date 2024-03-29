package task;

import java.util.*;


public class OrangeTest {
    public static void main(String[] args){

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        // builder() allows you to "skip" fields
        // If Orange had 10 fields and you filled out 2/10, then it would automatically set the other 8 to default values
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
//        prettyPrintApple(inventory, simpleFormatter);
        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("-----------------------");
        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory, fancyFormatter);

    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }

    }
}
