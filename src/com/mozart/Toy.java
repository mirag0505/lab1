package com.mozart;

class Toy extends Product {

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= price;
    }
}
