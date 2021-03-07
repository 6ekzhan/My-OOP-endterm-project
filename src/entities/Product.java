package entities;

import java.time.LocalDate;

public class Product {
    public int id;
    public String type_of_technique;
    public String model;
    public LocalDate release_date;
    public String country_of_production;
    public int guarantee_period;
    public int price;

    public Product() {
    }

    public Product(int id, String type_of_technique, String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        this.id = id;
        this.type_of_technique = type_of_technique;
        this.model = model;
        this.release_date = release_date;
        this.country_of_production = country_of_production;
        this.guarantee_period = guarantee_period;
        this.price = price;
    }

    public Product(String type_of_technique, String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        this.type_of_technique = type_of_technique;
        this.model = model;
        this.release_date = release_date;
        this.country_of_production = country_of_production;
        this.guarantee_period = guarantee_period;
        this.price = price;
    }

    public Product(String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        this.model = model;
        this.release_date = release_date;
        this.country_of_production = country_of_production;
        this.guarantee_period = guarantee_period;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_of_technique() {
        return type_of_technique;
    }

    public void setType_of_technique(String type_of_technique) {
        this.type_of_technique = type_of_technique;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public String getCountry_of_production() {
        return country_of_production;
    }

    public void setCountry_of_production(String country_of_production) {
        this.country_of_production = country_of_production;
    }

    public int getGuarantee_period() {
        return guarantee_period;
    }

    public void setGuarantee_period(int guarantee_period) {
        this.guarantee_period = guarantee_period;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type_of_technique='" + type_of_technique + '\'' +
                ", model='" + model + '\'' +
                ", release_date=" + release_date +
                ", country_of_production='" + country_of_production + '\'' +
                ", guarantee_period=" + guarantee_period +
                ", price=" + price +
                "}\n" ;
    }
}
