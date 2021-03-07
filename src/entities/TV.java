package entities;

import entities.Product;

import java.time.LocalDate;

public class TV extends Product{
    public TV() {
    }

    public TV(int id, String type_of_technique, String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        super(id, type_of_technique, model, release_date, country_of_production, guarantee_period, price);
    }

    public TV(String type_of_technique, String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        super(type_of_technique, model, release_date, country_of_production, guarantee_period, price);
    }

    public TV(String model, LocalDate release_date, String country_of_production, int guarantee_period, int price) {
        super(model, release_date, country_of_production, guarantee_period, price);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getType_of_technique() {
        return super.getType_of_technique();
    }

    @Override
    public void setType_of_technique(String type_of_technique) {
        super.setType_of_technique(type_of_technique);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public LocalDate getRelease_date() {
        return super.getRelease_date();
    }

    @Override
    public void setRelease_date(LocalDate release_date) {
        super.setRelease_date(release_date);
    }

    @Override
    public String getCountry_of_production() {
        return super.getCountry_of_production();
    }

    @Override
    public void setCountry_of_production(String country_of_production) {
        super.setCountry_of_production(country_of_production);
    }

    @Override
    public int getGuarantee_period() {
        return super.getGuarantee_period();
    }

    @Override
    public void setGuarantee_period(int guarantee_period) {
        super.setGuarantee_period(guarantee_period);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
