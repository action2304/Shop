package com.epam.stream27.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Products {

    private List<String> productsList = new ArrayList<>();

    {
        productsList.add("Ball");
        productsList.add("Gloves");
        productsList.add("T-shirt");
        productsList.add("Sneakers");
        productsList.add("Skiing");
    }

    public List<String> getProductsList() {
        return productsList;
    }

    private Map<String, Integer> price = new HashMap<>();
    {
        price.put(productsList.get(0), 10);
        price.put(productsList.get(1), 30);
        price.put(productsList.get(2), 15);
        price.put(productsList.get(3), 50);
        price.put(productsList.get(4), 100);
    }

    public Map<String, Integer> getProductsPrice(){
        return price;
    }
}
