package com.mozart;

import java.util.Scanner;

class Technique extends Product {

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

class Laptop extends Technique {
    public double diagonal;
    public double cpu;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
        this.diagonal = Double.valueOf(inSplit[2]);
        this.cpu = Double.valueOf(inSplit[3]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.diagonal + " " + this.cpu;
    }
}

class Camera extends Technique {
    public int matrix;
    public double diaphragm;
    // возвращается состояние объекта в виде строки определяет толко в наследниках

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
        this.matrix = Integer.valueOf(inSplit[2]);
        this.diaphragm = Double.valueOf(inSplit[3]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.matrix + " " + this.diaphragm;
    }
}
