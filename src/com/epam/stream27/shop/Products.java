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

    private Map<Integer, Integer> price = new HashMap<>();
    {
        price.put(0, 10);
        price.put(1, 30);
        price.put(2, 15);
        price.put(3, 50);
        price.put(4, 100);
    }

    public Map<Integer, Integer> getProductsPrice(){
        return price;
    }
}
