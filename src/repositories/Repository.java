package repositories;

import data.IDBManager;
import entities.Product;
import entities.Fridge;
import entities.TV;
import entities.WashingMachine;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Repository implements IRepository{
    private final IDBManager idbManager;

    public Repository(IDBManager idbManager) {
        this.idbManager = idbManager;
    }

    @Override
    public boolean addHouseholdAppliances(Product product) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO household_appliances_store (type_of_technique, model, release_date, country_of_production, guarantee_period, price) VALUES (?, ?, ?, ?, ?, ?)"); // sql statement to add the product
            preparedStatement.setString(1, product.getType_of_technique());
            preparedStatement.setString(2, product.getModel());
            preparedStatement.setDate(3, Date.valueOf(product.getRelease_date()));
            preparedStatement.setString(4, product.getCountry_of_production());
            preparedStatement.setInt(5, product.getGuarantee_period());
            preparedStatement.setInt(6, product.getPrice());
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteProductByID(int id){
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM household_appliances_store where id = " + id); // sql statement to delete the product by ID
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Fridge> showAllFridges(){
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM household_appliances_store where type_of_technique = 'fridge'"); // sql statement to find the products which are fridge
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Fridge> fridges = new ArrayList<>();
            while (resultSet.next()) {
                Fridge fridge = new Fridge(
                        resultSet.getInt("id"),
                        resultSet.getString("type_of_technique"),
                        resultSet.getString("model"),
                        resultSet.getDate("release_date").toLocalDate(),
                        resultSet.getString("country_of_production"),
                        resultSet.getInt("guarantee_period"),
                        resultSet.getInt("price")
                );
                fridges.add(fridge);
            }
            return fridges;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<TV> showAllTVs(){
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM household_appliances_store where type_of_technique = 'tv'");// sql statement to find the products which are fridge
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<TV> tvs = new ArrayList<>();
            while (resultSet.next()) {
                TV tv = new TV(
                        resultSet.getInt("id"),
                        resultSet.getString("type_of_technique"),
                        resultSet.getString("model"),
                        resultSet.getDate("release_date").toLocalDate(),
                        resultSet.getString("country_of_production"),
                        resultSet.getInt("guarantee_period"),
                        resultSet.getInt("price")
                );
                tvs.add(tv);
            }
            return tvs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<WashingMachine> showAllWashingMachines(){
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM household_appliances_store where type_of_technique = 'washing_machine'");// sql statement to find the products which are washing machine
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<WashingMachine> washingMachines = new ArrayList<>();
            while (resultSet.next()) {
                WashingMachine washingMachine = new WashingMachine(
                        resultSet.getInt("id"),
                        resultSet.getString("type_of_technique"),
                        resultSet.getString("model"),
                        resultSet.getDate("release_date").toLocalDate(),
                        resultSet.getString("country_of_production"),
                        resultSet.getInt("guarantee_period"),
                        resultSet.getInt("price")
                );
                washingMachines.add(washingMachine);
            }
            return washingMachines;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Product> SearchCheapestFrom(String type_of_technique) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM household_appliances_store Where price = (SELECT MIN(price) FROM household_appliances_store) AND type_of_technique = '" + type_of_technique + "'");// sql statement to find the products that you want and which are cheap
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Product> product1 = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("type_of_technique"),
                        resultSet.getString("model"),
                        resultSet.getDate("release_date").toLocalDate(),
                        resultSet.getString("country_of_production"),
                        resultSet.getInt("guarantee_period"),
                        resultSet.getInt("price")
                );
                product1.add(product);
            }
            return product1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Product> SearchTheMostExpensiveFrom(String type_of_technique) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM household_appliances_store Where price = (SELECT MAX(price) FROM household_appliances_store) AND type_of_technique = '" + type_of_technique + "'");// sql statement to find the products that you want and which are expensive
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Product> product1 = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("type_of_technique"),
                        resultSet.getString("model"),
                        resultSet.getDate("release_date").toLocalDate(),
                        resultSet.getString("country_of_production"),
                        resultSet.getInt("guarantee_period"),
                        resultSet.getInt("price")
                );
                product1.add(product);
            }
            return product1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}