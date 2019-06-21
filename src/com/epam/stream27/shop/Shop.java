package com.epam.stream27.shop;

import java.util.Scanner;

class Shop {

    int productNumber;
    int customerNumber;

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
        customerNumber = scanner.nextInt(); // 3
        switch (customerNumber) {
            case 1:
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 2:
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 3:
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 4:
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 5:
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
        }
    }

    public int getProduct(int productNumber) {

        switch (productNumber) {
            case 1:
                System.out.println(customers.getCustomers().get(0) + StringConstants.bought + products.getProductsList().get(customerNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(1,1 ));
                break;
            case 2:
                System.out.println(customers.getCustomers().get(1) + StringConstants.bought + products.getProductsList().get(customerNumber));
                System.out.println(StringConstants.currentBalance);
                break;
            case 3:
                System.out.println(customers.getCustomers().get(2) + StringConstants.bought + products.getProductsList().get(customerNumber));
                System.out.println(StringConstants.currentBalance);
                break;
            case 4:
                System.out.println(customers.getCustomers().get(3) + StringConstants.bought + products.getProductsList().get(customerNumber));
                System.out.println(StringConstants.currentBalance);
                break;
            case 5:
                System.out.println(customers.getCustomers().get(4) + StringConstants.bought + products.getProductsList().get(customerNumber));
                System.out.println(StringConstants.currentBalance);
                break;
        }
        return productNumber;
    }

    public int balanceAfterPurchaseMethod(int customerNumber,int productNumber) {

//        int balanceAfterPurchase = customers.getCurrentBalance().get(keyForCurrentBalance) -
//                products.getProductsPrice().get(keyForPrice);
        int balanceAfterPurchase = customers.getCurrentBalance().get(customerNumber) -
                products.getProductsPrice().get(productNumber);
        return balanceAfterPurchase;
    }


}
