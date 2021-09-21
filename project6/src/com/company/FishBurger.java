package com.company;

public class FishBurger extends Burger{
    public FishBurger(){
        bunTypes = new WhiteBun();
        cutletTypes = new FishCutlet();
        cheeseType = new CheeseHasnt();
    }

    public void display(){
        System.out.println("FishBurger");
    }
}
