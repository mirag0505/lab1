package com.mozart;

import java.util.Scanner;

class Kefir extends Lactic {
    private double alcohol;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.init(scanner);
        alcohol = Double.valueOf(inSplit[2]);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + alcohol;
    }
}