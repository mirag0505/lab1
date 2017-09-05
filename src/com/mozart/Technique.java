package com.mozart;

class Technique extends Product {

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost > this.price;
    }
}

