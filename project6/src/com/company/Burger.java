package com.company;

public abstract class Burger {
    BunTypes bunTypes;
    CutletTypes cutletTypes;
    CheeseType cheeseType;

    public void setBunTypes(BunTypes bunTypes) {
        this.bunTypes = bunTypes;
    }

    public void setCutletTypes(CutletTypes cutletTypes) {
        this.cutletTypes = cutletTypes;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }

    public Burger(){

    }

    public abstract void display();

    public void typeBun(){
        bunTypes.bun();
    }

    public void typeCutlet(){
        cutletTypes.cutlet();
    }

    public void typeCheese(){
        cheeseType.cheese();
    }
}
