package com.gaweljablonski;

import java.util.*;
import java.util.Scanner;

public class ListaMapa {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

        List<String> names = new ArrayList<>();
        names.add("Jacek");
        names.add("Paweł");
        names.add("Gaweł");
        names.add("Dorota");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println();
        names.set(0, "Karol");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println();
        Collections.sort(names);
        for (String name : names){
            System.out.println(name);
        }
        System.out.println();
        names.remove("Karol");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println();

        System.out.println(names);

        System.out.println(names.size());

        Map<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Mariusz", "Pizza");
        nameToMeal.put("Jacek", "Burger");
        nameToMeal.put("Dominikik", "Pasta");
        nameToMeal.put("Gaweł", "Sandwich");
        nameToMeal.put("Paweł", "Cake");
        System.out.println(nameToMeal.get("Gaweł"));

        System.out.println(nameToMeal);
        System.out.println(nameToMeal.size());

        Set<String> keys = nameToMeal.keySet();
        for (String key : keys){
            System.out.println(key);
        }


        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println(nameToMeal.get(name));

        for (int i = 0 ; i < nameToMeal.size() ; i++){
            System.out.println(nameToMeal.get(i));
        }
        Random random = new Random();
        int liczba = random.nextInt(50000);
        System.out.println(liczba);
//        int a = 10;
//        int b = 0;
//        if (b == 0){
//            System.out.println("BŁĄD!!!");
//        } else System.out.println(a/b);


    }
}
