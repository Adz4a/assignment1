package com.company;

public class CheeseBurger extends Burger{
    public CheeseBurger(){
        bunTypes = new WhiteBun();
        cutletTypes = new BeefCutlet();
        cheeseType = new CheeseHas();
    }

    public void display(){
        System.out.println("CheeseBurger");
    }
}
