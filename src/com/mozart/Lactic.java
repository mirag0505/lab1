package com.mozart;


//fixme Писать несколько классов в одном файле без острой необходимости - не тру

class Lactic extends Product {

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost >= this.price;
    }
}



