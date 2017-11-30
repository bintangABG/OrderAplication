
package com.jodhy.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TesOrderArray {

    public static void main(String[] args) {
        Products iceCream = new Products("Magnum Vanilla",8000.0);
        Products indomie = new Products("Indomie Goreng",2500.0);
        Products cocaCola = new Products("Coca Cola",4500.0);
        //Kasir menginput dan menghitung barang yang dibeli
        //disimpan dalam order
        OrderItem iceItem = new OrderItem(iceCream, 5);
        iceItem.setDiscount(0.15);
        OrderItem indomieItem = new OrderItem(indomie, 20);        
        OrderItem cocaColaItem = new OrderItem(cocaCola, 4);
        iceItem.setDiscount(0.10);
        
        ArrayList <OrderItem> items = new ArrayList<>();
        items.add(iceItem);
        items.add(indomieItem);
        items.add(cocaColaItem);
        
        items.remove(2);
        
        
//        OrderItem [] items = {iceItem,indomieItem,cocaColaItem};
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        Order order = new Order();
        order.setOrderItems(items);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Nama Barang \t\t Harga Barang \t Jumlah Barang \t\t Total Harga ");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (OrderItem item : items) {
            System.out.println(item.getProduct().getProductName()+"\t\t"+"Rp "+df.format(item.getProduct().getPrice())+"\t\t"+
            item.getQuantity()+"\t\t"+"Rp "+df.format((item.getProduct().getPrice()* item.getQuantity())));
        } 
        
        System.out.println("==========================================================================================");
        
        double totalBelanja = order.calculateTotalOrder();
        System.out.println("Total Belanja Sebelum Discount \t\t\t\t\t"+"Rp "+df.format(totalBelanja));
        
        double totalBelanjadisc = order.calculateTotalOrderWithDiscount();
        System.out.println("Total Belanja Setelah Discount \t\t\t\t\t"+"Rp "+df.format(totalBelanjadisc));
        
        
        System.out.println("Anda Hemat \t\t\t\t\t\t\t"+"Rp "+df.format((totalBelanja-totalBelanjadisc)));
        
        
        
        
        double totalBelanjadiscandPPN = order.calculateTotalOrderWithDiscountAndPPN();
        System.out.println("PPN  \t\t\t\t\t\t\t\t"+"Rp."+df.format(order.calculatePPN()));
        System.out.println("===========================================================================================");
        System.out.println("Total Belanja Setelah Dikenai PPN \t\t\t\t"+"Rp "+
                df.format(order.calculateTotalOrderWithDiscount()+order.calculatePPN()));
        
    }
    
}
