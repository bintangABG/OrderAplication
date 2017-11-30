package orderaplication;

import com.jodhy.model.Products;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Products("Cilok", 400.0));
        products.add(new Products("Es Cincaw", 15000.0));
        
        products.forEach((product) -> {
            System.out.println("Products = "+product.getProductName());
        }); // Versi 8
        
        
        ArrayList <String> names = new ArrayList<>();
        names.add("John");
        names.add("James");
        names.add("Siti");
        names.add("Bond");
        
        for (String name : names) {
            System.out.println("Nama : "+name);
        }
    }
    
}
