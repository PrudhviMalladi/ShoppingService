package com.shopping.service;

import java.util.Comparator;

public class sortProductByNameLength implements Comparator<Products> {
    @Override
    public int compare(Products obj1, Products obj2)
    {
        if (obj1.getProduct_Name().length() > obj2.getProduct_Name().length()) {
            return 1;
        } else if (obj1.getProduct_Name().length() < obj2.getProduct_Name().length()) {
            return -1;
        } else {
            return 0;
        }


    }

}