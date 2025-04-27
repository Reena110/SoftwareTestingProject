package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;

public class Lab01_List
{
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Headphones");
        System.out.println("Shopping Cart =" +cart);
        cart.remove("Mouse");
        System.out.println("Removed products from the cart =" +cart);
        System.out.println("First item in the cart =" +cart.get(0));
        System.out.println("Total Items in the cart =" +cart.size());
    }
}
