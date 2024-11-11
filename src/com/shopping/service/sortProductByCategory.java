package com.shopping.service;

import java.util.Comparator;

public class sortProductByCategory implements Comparator<Products> {
    @Override
    public int compare(Products obj1, Products obj2) {
        return obj1.getProduct_Category().compareTo(obj2.getProduct_Category());
    }
}
