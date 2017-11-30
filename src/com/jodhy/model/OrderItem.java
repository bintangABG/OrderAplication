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
public class OrderItem {
    private Products product;
    private int quantity;
    private double discount;

    
    
    public OrderItem() {
    }

    public OrderItem(Products product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    
    public double calculateItemTotalPrice () {
        double totalPrice = this.product.getPrice() * this.quantity;
        return totalPrice;
    }
    public double calculateDisconItemValue () {
        double discount = calculateItemTotalPrice() * this.discount;
        return discount;
    }
    
    public double calculateTotalHargaDenganDiskon () {
        double total = calculateItemTotalPrice() - calculateDisconItemValue();
        return total;
    }
    
    
    
    
    /**
     * @return the product
     */
    public Products getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Products product) {
        this.product = product;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product.getProductName()+" \t\t "+this.quantity+"\t\t Rp."+product.getPrice();
    }

    

    
    
    
}
