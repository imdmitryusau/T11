package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Task1
        Car c = new Car("AAA","GG", 1995);
        Car c1 = new Car("BBB", "GG1", 1998);
        Car c2 = new Car("CCC","GG2", 2011);
        Car c3 = new Car("DDD", "GG3",2007);
        Car c4 = new Car("EEE", "GG4", 1992);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);

        Collections.sort(cars); //sorting

        for (Car cr : cars) //displaying
        {
            System.out.println(cr.toString());
        }

        //Task2
        //Creating an ArrayList container and insert Item class objects (minimum 5) into it
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("s20808","AAA"));
        items.add(new Item("s20809","BBB"));
        items.add(new Item("s20810","CCC"));
        items.add(new Item("s20811","DDD"));

        for (Item i : items) //calling show method
        {
            i.Show();
        }

        //Using the for-each loop to place all created objects in the HashMap container,
        // where the key will be the identifier of the object and the value will be the name of the object
        HashMap<String, String> itemHashMap = new HashMap<>();

        for (Item i : items)
        {
            itemHashMap.put(i.getId(), i.getName());
        }

        //Using the entrySet() method,
        // iterating over the map and write the ID and name of the current item on the console
        for (Map.Entry<String, String> entries : itemHashMap.entrySet())
        {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());

        }
        //Task3
        List<Item> items1=items.subList(1, 2); //between
    }
}
