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

    private Map<String, Integer> currentBalance = new HashMap<>();

    {
        currentBalance.put(customers.get(0), 1000);
        currentBalance.put(customers.get(1), 2000);
        currentBalance.put(customers.get(2), 500);
        currentBalance.put(customers.get(3), 1300);
        currentBalance.put(customers.get(4), 700);
    }

    public Map<String, Integer> getCurrentBalance(){
        return currentBalance;
    }
}
