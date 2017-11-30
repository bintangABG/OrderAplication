/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodhy.model;

/**
 *
 * @author user
 */
public class Products {
    private String productName;
    private double price;

    public Products() {
    }

    public Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

        
    
    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return this.getProductName()+"Rp. "+this.getPrice();
//    }
    
    
}
