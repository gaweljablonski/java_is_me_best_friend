package com.gaweljablonski;



import java.util.*;

public class Party {
    private List<com.gaweljablonski.Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, com.gaweljablonski.Guest> phoneToGuest = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void addGuest(){
        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek: ");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu: ");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if(isVeganString.equals("Y")){
            isVegan = true;
        } else {
            isVegan = false;
        }

        com.gaweljablonski.Guest guest = new com.gaweljablonski.Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);

        guests.add(guest);
    }

    public void displayMeals (){
        for (String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        com.gaweljablonski.Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayGuestInformation();
    }

    public void displayGuest(){
        for (com.gaweljablonski.Guest guest : guests) {
            guest.displayGuestInformation();
            System.out.println();

        }
        if (guests.isEmpty()){
            System.out.println("Lista gości jest pusta :(");
        }
    }


}
