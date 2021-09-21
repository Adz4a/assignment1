package com.company;

public class BlackBurger extends Burger{
    public BlackBurger(){
        bunTypes = new BlackBun();
        cutletTypes = new BeefCutlet();
        cheeseType = new CheeseHasnt();
    }

    public void display(){
        System.out.println("BlackBurger");
    }
}
