package com.shopping.service;

public class ProductSorterClient {
    public static void main(String[] args) {
        ProductSorter ps = new ProductSorter();
        ps.getProductList();
        System.out.println(ps.sortProductByNameLength());
        System.out.println(ps.sortProductByName());
        System.out.println(ps.sortProductByPriceDescending());
        System.out.println(ps.sortProductByCategoryAscendingAndByPriceDescending());
    }
}



