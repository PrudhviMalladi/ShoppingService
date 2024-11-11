package com.shopping.service;

import java.util.Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ProductSorter {

    List<Products> getProductList()
    {
        List<Products> l1=new LinkedList<Products>();
        l1.add(new Products(101,"clothing","T-Shirt",200));
        l1.add(new Products(102,"clothing","Shirt",400));
        l1.add(new Products(103,"clothing","Phaints",600));
        l1.add(new Products(104,"clothing","Jeans",700));
        l1.add(new Products(105,"clothing","Shorts",200));
        l1.add(new Products(106,"toys","car",350));
        l1.add(new Products(107,"toys","dinner_set",150));
        l1.add(new Products(108,"toys","doctor_kit",450));
        l1.add(new Products(109,"toys","remote_car",1150));
        l1.add(new Products(110,"toys","phone",250));
        return l1;
    }

    List<Products> sortProductByName()
    {
        List<Products> l1=new ProductSorter().getProductList();
        Collections.sort(l1,new sortProductByName());
        return l1;
    }

    List<Products> sortProductByPriceDescending()
    {
        List<Products> l1=new ProductSorter().getProductList();
        Collections.sort(l1,new sortProductByPrice());

        return l1;
    }

    List<Products> sortProductByNameLength()
    {
        List<Products> l1=new ProductSorter().getProductList();
        Collections.sort(l1,new sortProductByNameLength());

        return l1;
    }

    List<Products> sortProductByCategoryAscendingAndByPriceDescending()
    {
        List<Products> l1=new ProductSorter().getProductList();
        Collections.sort(l1,new sortProductByPrice());
        Collections.sort(l1,new sortProductByCategory());

        return l1;
    }
}