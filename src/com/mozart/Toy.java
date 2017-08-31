package com.mozart;

import java.util.Scanner;

class Toy extends Product {
    // возвращается состояние объекта в виде строки определяет толко в наследниках

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

class Lego extends Toy {

    public int numberOfDetails;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
        this.numberOfDetails = Integer.valueOf(inSplit[2]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.numberOfDetails;
    }
}
