/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodhy.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Order {

    
    private final double PPN = 0.1;
    private Date tanggalBelanja;
    
    private ArrayList <OrderItem> orderItems;

    public double calculateTotalOrder() {
        double totalOrder = 0.0;
        
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateItemTotalPrice();
        }
        return totalOrder;
    }
    
    public double calculateTotalOrderWithDiscount() {
        double totalOrder = 0.0;
        
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateTotalHargaDenganDiskon();
        }
        return totalOrder;
    }
    
    public double calculateTotalOrderWithDiscountAndPPN() {
        double totalOrder = 0.0;
        
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateTotalHargaDenganDiskon()+calculatePPN();
        }
        return totalOrder;
    }
    public double calculatePPN() {
        double totalOrder = 0.0;
        
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateTotalHargaDenganDiskon()*this.PPN;
        }
        return totalOrder;
    }

    /**
     * @return the orderItems
     */
    public ArrayList <OrderItem> getOrderItems() {
        return orderItems;
    }

    /**
     * @param orderItems the orderItems to set
     */
    public void setOrderItems(ArrayList <OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    /**
     * @return the tanggalBelanja
     */
    public Date getTanggalBelanja() {
        return tanggalBelanja;
    }

    /**
     * @param tanggalBelanja the tanggalBelanja to set
     */
    public void setTanggalBelanja(Date tanggalBelanja) {
        this.tanggalBelanja = tanggalBelanja;
    }
    
}
