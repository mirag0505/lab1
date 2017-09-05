package com.mozart;

import java.util.Scanner;

class Laptop extends Technique {
    public double diagonal;
    public double cpu;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.name = inSplit[0];
        super.price = Integer.valueOf(inSplit[1]);
        this.diagonal = Double.valueOf(inSplit[2]);
        this.cpu = Double.valueOf(inSplit[3]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.diagonal + " " + this.cpu;
    }
}