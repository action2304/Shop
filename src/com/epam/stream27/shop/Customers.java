package com.epam.stream27.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Customers {

    private List<String> customers = new ArrayList<>();

    {
        customers.add("Alex");
        customers.add("John");
        customers.add("Mike");
        customers.add("Alice");
        customers.add("Tomas");
    }

    public List<String> getCustomers() {
        return customers;
    }

    private Map<Integer, Integer> currentBalance = new HashMap<>();

    {
        currentBalance.put(0, 1000);
        currentBalance.put(1, 2000);
        currentBalance.put(2, 500);
        currentBalance.put(3, 1300);
        currentBalance.put(4, 700);
    }

    public Map<Integer, Integer> getCurrentBalance(){
        return currentBalance;
    }
}
