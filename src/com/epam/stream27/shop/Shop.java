package com.epam.stream27.shop;

import java.util.Scanner;

class Shop {

    int productNumber;
    int customerNumber;
    String customerName;

    private Scanner scanner = new Scanner(System.in);
    private Customers customers = new Customers();
    private Products products = new Products();

    public void getCustomer() {

        System.out.println("Please, choose the customer:\n(Enter the number)");
        System.out.println("0 - Alex");
        System.out.println("1 - John");
        System.out.println("2 - Mike");
        System.out.println("3 - Alice");
        System.out.println("4 - Tomas");
        customerNumber = scanner.nextInt();
        switch (customerNumber) {
            case 0:
                customerName = customers.getCustomers().get(0);
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 1:
                customerName = customers.getCustomers().get(1);
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 2:
                customerName = customers.getCustomers().get(2);
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 3:
                customerName = customers.getCustomers().get(3);
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
            case 4:
                customerName = customers.getCustomers().get(4);
                System.out.println(StringConstants.messageForSelection);
                getProduct(productNumber = scanner.nextInt());
                break;
        }
    }

    public int getProduct(int productNumber) {

        switch (productNumber) {
            case 0:
                System.out.println(customerName + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(customerNumber, productNumber));
                break;
            case 1:
                System.out.println(customerName + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(customerNumber, productNumber));
                break;
            case 2:
                System.out.println(customerName + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(customerNumber, productNumber));
                break;
            case 3:
                System.out.println(customerName + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(customerNumber, productNumber));
                break;
            case 4:
                System.out.println(customerName + StringConstants.bought + products.getProductsList().get(productNumber));
                System.out.println(StringConstants.currentBalance + balanceAfterPurchaseMethod(customerNumber, productNumber));
                break;
        }
        return productNumber;
    }

    public int balanceAfterPurchaseMethod(int customerNumber, int productNumber) {

        int balanceAfterPurchase = customers.getCurrentBalance().get(customerNumber) -
                products.getProductsPrice().get(productNumber);
        return balanceAfterPurchase;
    }


}
