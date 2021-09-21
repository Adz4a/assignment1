package com.company;

public class HamBurger extends Burger{
    public HamBurger(){
        bunTypes = new WhiteBun();
        cutletTypes = new BeefCutlet();
        cheeseType = new CheeseHasnt();
    }

    public void display(){
        System.out.println("HamBurger");
    }
}
