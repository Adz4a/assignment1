package com.company;

public class ChickenBurger extends Burger{
    public ChickenBurger(){
        bunTypes = new WhiteBun();
        cutletTypes = new ChickenCutlet();
        cheeseType = new CheeseHasnt();
    }

    public void display(){
        System.out.println("ChickenBurger");
    }
}
