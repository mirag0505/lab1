package com.mozart;

class Technique extends Product {

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= price;
    }
}

