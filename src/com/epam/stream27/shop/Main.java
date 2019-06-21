package com.epam.stream27.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final String delimiter = "";

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        Customers customers = new Customers();
        Products products = new Products();

        System.out.println(delimiter);
        System.out.println("Customers and their balance: " + customers.getCurrentBalance());
        System.out.println(delimiter);
        System.out.println("Products and their price: " + products.getProductsPrice());
        System.out.println(delimiter);
        shop.getCustomer();
    }
}
