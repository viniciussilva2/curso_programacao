package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Triangle;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        entities.Product product = new entities.Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.next();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
                
        sc.close();
    }

}
