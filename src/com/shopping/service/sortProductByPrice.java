package com.shopping.service;

import java.util.Comparator;

public class sortProductByPrice implements Comparator<Products> {
    @Override
    public int compare(Products obj1, Products obj2)
    {
        return obj2.getProduct_Price()-obj1.getProduct_Price();
    }

}