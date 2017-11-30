/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderaplication;

import com.jodhy.model.Order;
import com.jodhy.model.OrderItem;
import com.jodhy.model.Products;
import com.sun.org.apache.bcel.internal.generic.F2D;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StringUtility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner scan;
            scan = new Scanner(new File("e:/JAVA/dataProduk.txt"));
            ArrayList<OrderItem> items = new ArrayList<>();

            while (scan.hasNextLine()) {
                String produkDanHarga = scan.nextLine();
                String[] data = produkDanHarga.split(",");
                String namaProduk = data[0];
                String clear = data[1].trim();
                double harga = Double.parseDouble(clear);
                String clear1 = data[2].trim();
                int qty = Integer.parseInt(clear1);
                double diskon = Double.parseDouble(data[3].trim());
                Products p = new Products(namaProduk, harga);
                OrderItem item = new OrderItem(p, qty);
                item.setDiscount(diskon);
                items.add(item);
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Nama Product \t\t Jumlah \tDiscount \t Harga");
            System.out.println("--------------------------------------------------------------------------");
            Order order = new Order();
            for (OrderItem item : items) {

                System.out.println(item.getProduct().getProductName() + " \t\t" + item.getQuantity()+"\t\t"+item.getDiscount() + "\t\t Rp."
                        + item.getProduct().getPrice());
                order.setOrderItems(items);
            }
            System.out.println("==========================================================================");
            System.out.println("Total Harga  \t\t\t\t\t\t Rp." + order.calculateTotalOrder());
            System.out.println("Total Harga Setelah Diskon     \t\t\t\t RP." + order.calculateTotalOrderWithDiscount());
            System.out.println("Total Harga Setelah PPN \t\t\t\t Rp. " + (order.calculateTotalOrderWithDiscount()+order.calculatePPN()));

            for (OrderItem item : items) {

            }

        } catch (Exception e) {
        }

//        String produkDanHarga = "Ice Cream, 8000.0";
//        String [] data = produkDanHarga.split(",");
//        String namaProduk = data[0];
//        String clear = data[1].trim();
//        double harga = Double.parseDouble(clear);
//        
//        System.out.println(namaProduk);
//        System.out.println(harga);
    }

}
