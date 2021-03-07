import controller.Controller;

import java.util.Scanner;
import java.time.LocalDate;

public class MyApplication {
    private final Controller controller;
    private final Scanner scanner;

    public MyApplication(Controller Controller) {
        this.controller = Controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Choose one option:\n " +
                    "a) Press 1 to add the product\n " +
                    "b) Press 2 to delete the product by it's id\n " +
                    "c) Press 3 to show all fridges\n " +
                    "d) Press 4 to show all TVs\n " +
                    "e) Press 5 to show all washing machines\n " +
                    "f) Press 6 to find the cheapest product you need\n " +
                    "g) Press 7 to find the most expensive product you need\n " +
                    "h) Press 0 to exit\n ");
            int choice = scanner.nextInt();
            if(choice == 1){
                addHouseholdAppliances();
            }
            if(choice == 2){
                deleteProductByID();
            }
            if(choice == 3){
                showAllFridges();
            }
            if(choice == 4){
                showAllTVs();
            }
            if(choice == 5){
                showAllWashingMachines();
            }
            if(choice == 6 ){
                SearchCheapestFrom();
            }
            if(choice == 7){
                SearchTheMostExpensiveFrom();
            }
            if(choice==0){
                break;
            }
            System.out.println("******************");
        }
    }

    public void addHouseholdAppliances(){
        System.out.println("Write the type of technique:");
        String type_of_technique = scanner.next();
        System.out.println("Write a model of the technique:");
        String model = scanner.next();
        System.out.println("Write the date of manufacture:");
        String date = scanner.next();
        LocalDate release_date = LocalDate.parse(date);
        System.out.println("Write the country of the manufacturer:");
        String country_of_production = scanner.next();
        System.out.println("Write the warranty period (in months):");
        int guarantee_period = scanner.nextInt();
        System.out.println("Write the price of the item:");
        int price = scanner.nextInt();

        System.out.println(controller.addHouseholdAppliances(type_of_technique, model, release_date, country_of_production, guarantee_period, price));
    }

    public void deleteProductByID(){
        System.out.println("Write product's ID:");
        int id = scanner.nextInt();
        System.out.println(controller.deleteProductByID(id));
    }

    public void showAllFridges(){
        System.out.println(controller.showAllFridges());
    }

    public void showAllTVs(){
        System.out.println(controller.showAllTVs());
    }

    public void showAllWashingMachines(){
        System.out.println(controller.showAllWashingMachines());
    }

    public void SearchCheapestFrom(){
        System.out.println("Write name of technique type that you need:");
        String type_of_technique = scanner.next();
        System.out.println(controller.SearchCheapestFrom(type_of_technique));
    }

    public void SearchTheMostExpensiveFrom(){
        System.out.println("Write name of technique type that you need:");
        String type_of_technique = scanner.next();
        System.out.println(controller.SearchTheMostExpensiveFrom(type_of_technique));
    }
}