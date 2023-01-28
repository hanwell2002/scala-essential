package maps;


//Java:  how to use values() method
import java.util.*;

public class HashMapExampl01 {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<String, Double> priceCoffeeByDay = new HashMap<String, Double>();
        // put key-value pairs
        priceCoffeeByDay.put("Sunday", 2.45);
        priceCoffeeByDay.put("Monday", 3.54);
        priceCoffeeByDay.put("Tuesday", 4.50);
        priceCoffeeByDay.put("Wednesday", 3.21);
        priceCoffeeByDay.put("Thursday", 5.11);
        priceCoffeeByDay.put("Friday", 2.39);
        priceCoffeeByDay.put("Saturday", 5.87);

        // HashMap key-value pairs
        System.out.println("Initial Mappings are: " + priceCoffeeByDay);

        Set<String> keys = priceCoffeeByDay.keySet();

        System.out.println("Key set"  + keys);

        // Using values() to get the set view of values
        System.out.println("Price: " + priceCoffeeByDay.values());


        int[] arr = {2,3,65,76};

        System.out.println("first :" + arr[3]);

        List<Integer> list  = new ArrayList<>();
        list.add(18);
       // list.add("Hello");

    }
}
