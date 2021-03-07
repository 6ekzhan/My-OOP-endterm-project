package repositories;

import entities.Product;
import entities.Fridge;
import entities.TV;
import entities.WashingMachine;

import java.util.ArrayList;

public interface IRepository { //created methods to use them to perform an action in the database
    public boolean addHouseholdAppliances(Product product);
    public boolean deleteProductByID(int id);
    public ArrayList<Fridge> showAllFridges();
    public ArrayList<TV> showAllTVs();
    public ArrayList<WashingMachine> showAllWashingMachines();
    public ArrayList<Product> SearchCheapestFrom(String type_of_technique);
    public ArrayList<Product> SearchTheMostExpensiveFrom(String type_of_technique);
}
