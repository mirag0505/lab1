package com.mozart;

import java.util.Scanner;

class Lactic extends Product {

    @Override
    public void init(Scanner scanner) {

    }

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public boolean canBuy(int cost) {
        return cost > this.price;
    }
}

class Kefir extends Lactic {
    private double fat;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
        this.fat = Double.valueOf(inSplit[2]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.fat;
    }
}

class Milk extends Lactic {
    public double alcohol;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
        this.alcohol = Double.valueOf(inSplit[2]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.alcohol;
    }
}
