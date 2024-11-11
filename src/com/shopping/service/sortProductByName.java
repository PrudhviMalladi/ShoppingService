package com.shopping.service;

import java.util.Comparator;

public class sortProductByName implements Comparator<Products> {
    @Override
    public int compare(Products obj1, Products obj2)
    {
        return (obj1.getProduct_Name()).compareTo(obj2.getProduct_Name());
    }

}