package com.apkaSklepu.database;

import com.apkaSklepu.model.*;

public class ProductDB {

    private Product[] products = new Product[5];

    public ProductDB(){
        this.products[0] = new Butter("Lowieckie",10,"20 days");
        this.products[1] = new Cheese("Goudex",10,"12 days");
        this.products[2] = new Eggs("Jajopol",10,"14 days");
        this.products[3] = new Milk("UHT",10,"4 days");
        this.products[4] = new Mustard("Roleski",10,"21 days");
    }

    public void buy(){

    }

    public void addProduct(){

    }
}
