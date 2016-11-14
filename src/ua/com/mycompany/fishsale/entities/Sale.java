/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.mycompany.fishsale.entities;

import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 *
 * @author Igor Gayvan
 */
public class Sale {

    private int id;
    private Fish fish;
    private double pricePurchase;
    private LocalDate datePurchase;
    private double priceSale;
    private LocalDate dateSale;
    private double saleWeight;

    private static final double OVERHEADS = 0.1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public double getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(double pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public LocalDate getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDate datePurchase) {
        this.datePurchase = datePurchase;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public LocalDate getDateSale() {
        return dateSale;
    }

    public void setDateSale(LocalDate dateSale) {
        this.dateSale = dateSale;
    }

    public double getSaleWeight() {
        return saleWeight;
    }

    public void setSaleWeight(double saleWeight) {
        this.saleWeight = saleWeight;
    }

    /**
     * @param fishId
     * @param pricePurchase
     * @param datePurchase
     * @param priceSale
     * @param dateSale
     * @param saleWeight
     *
     */
    public Sale(Fish fish, double pricePurchase, LocalDate datePurchase, double priceSale, LocalDate dateSale, double saleWeight) {
        this.fish = fish;
        this.pricePurchase = pricePurchase;
        this.datePurchase = datePurchase;
        this.priceSale = priceSale;
        this.dateSale = dateSale;
        this.saleWeight = saleWeight;
    }

    public double calcIncome() {
        return (priceSale - pricePurchase - Days.daysBetween(datePurchase, dateSale).getDays() * OVERHEADS) * saleWeight;
    }

}
