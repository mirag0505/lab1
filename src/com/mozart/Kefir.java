package com.mozart;

import java.util.Scanner;

class Kefir extends Lactic {
    private double alcohol;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.name = inSplit[0];
        super.price = Integer.valueOf(inSplit[1]);
        this.alcohol = Double.valueOf(inSplit[2]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.alcohol;
    }
}