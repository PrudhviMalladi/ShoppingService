package com.shopping.service;




    public class Products {
        private int Product_id;
        private String Product_Category;
        private String Product_Name;
        private int Product_Price;

        public Products(int product_id, String product_Category, String product_Name, int product_Price) {
            Product_id = product_id;
            Product_Category = product_Category;
            Product_Name = product_Name;
            Product_Price = product_Price;
        }

        public int getProduct_id() {
            return Product_id;
        }

        public String getProduct_Category() {
            return Product_Category;
        }

        public String getProduct_Name() {
            return Product_Name;
        }

        public int getProduct_Price() {
            return Product_Price;
        }

        @Override
        public String toString() {
            return "Products{" +
                    "Product_id=" + Product_id +
                    ", Product_Category='" + Product_Category + '\'' +
                    ", Product_Name='" + Product_Name + '\'' +
                    ", Product_Price=" + Product_Price +
                    '}';
        }
    }


