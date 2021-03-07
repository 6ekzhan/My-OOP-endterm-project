package controller;

import entities.Product;
import repositories.IRepository;
import entities.Fridge;
import entities.TV;
import entities.WashingMachine;

import java.time.LocalDate;

public class Controller {
    private final IRepository iRepository;

    public Controller(IRepository iMedRepository) {
        this.iRepository = iMedRepository;
    }

    public String addHouseholdAppliances(String type_of_technique, String model, LocalDate release_date, String country_of_production, int guarantee_period, int price){
        boolean result = iRepository.addHouseholdAppliances(new Product(type_of_technique, model, release_date, country_of_production, guarantee_period, price));
        if (result){
            return "Product was added";
        }
        else
            return "Error";
    }

    public String deleteProductByID(int id){
        boolean result = iRepository.deleteProductByID(id);
        if(result){
            return "Product was deleted";
        }else{
            return "Error";
        }
    }

    public String showAllFridges(){
        String result = iRepository.showAllFridges().toString();
        return  result;
    }

    public String showAllTVs(){
        String result = iRepository.showAllTVs().toString();
        return  result;
    }
    public String showAllWashingMachines(){
        String result = iRepository.showAllWashingMachines().toString();
        return  result;
    }

    public String SearchCheapestFrom(String type_of_technique){
        String result = iRepository.SearchCheapestFrom(type_of_technique).toString();
        return result;
    }

    public String SearchTheMostExpensiveFrom(String type_of_technique){
        String result = iRepository.SearchTheMostExpensiveFrom(type_of_technique).toString();
        return result;
    }
}
