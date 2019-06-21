package com.epam.stream27.shop;

import java.util.Map;
import java.util.Scanner;

class Shop {

    private int productNumber;

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        scanner.nextInt();
        this.productNumber = productNumber;
    }

    private Scanner scanner = new Scanner(System.in);
    private Customers customers = new Customers();
    private Products products = new Products();

    public void getCustomer() {

        System.out.println("Please, choose the customer:\n(Enter the number)");
        System.out.println("1 - Alex");
        System.out.println("2 - John");
        System.out.println("3 - Mike");
        System.out.println("4 - Alice");
        System.out.println("5 - Tomas");
        switch (scanner.nextInt(productNumber)) {
            case 1: // выбрали первого покупателя
                System.out.println(StringConstants.messageForSelection);
                getProduct(scanner.nextInt()); // выбрали товар
                break;
            case 2:
                System.out.println(StringConstants.messageForSelection);
                getProduct(scanner.nextInt());
                System.out.println(customers.getCustomers().get(1) + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println("Now his current balance = ");
                break;
            case 3:
                System.out.println(StringConstants.messageForSelection);
                getProduct(scanner.nextInt());
                System.out.println(customers.getCustomers().get(2) + StringConstants.bought + products.getProductsList().get(0));
                System.out.println("Now his current balance = ");
                break;
            case 4:
                System.out.println(StringConstants.messageForSelection);
                getProduct(scanner.nextInt());
                System.out.println(customers.getCustomers().get(3) + StringConstants.bought + products.getProductsList().get(0));
                System.out.println("Now his current balance = ");
                break;
            case 5:
                System.out.println(StringConstants.messageForSelection);
                getProduct(scanner.nextInt());
                System.out.println(customers.getCustomers().get(4) + StringConstants.bought + products.getProductsList().get(0));
                System.out.println("Now his current balance = ");
                break;
        }
    }

    public int getProduct(int productNumber) {

        switch (productNumber) {
            case 1:
                System.out.println(products.getProductsList().get(productNumber));
                System.out.println(customers.getCustomers().get(0) + StringConstants.bought + products.getProductsList().get(1));
                System.out.println("Now his current balance = " + balanceAfterPurchaseMethod("Alex", "Ball"));
                break;
            case 2:
                System.out.println(products.getProductsList().get(1));
                break;
            case 3:
                System.out.println(products.getProductsList().get(2));
                break;
            case 4:
                System.out.println(products.getProductsList().get(3));
                break;
            case 5:
                System.out.println(products.getProductsList().get(4));
                break;
        }
        return productNumber;
    }

    public int balanceAfterPurchaseMethod(String keyForCurrentBalance, String keyForPrice) {

        int balanceAfterPurchase = customers.getCurrentBalance().get(keyForCurrentBalance) -
                products.getProductsPrice().get(keyForPrice);
        return balanceAfterPurchase;
    }
}
