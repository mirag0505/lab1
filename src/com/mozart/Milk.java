package com.mozart;


import java.util.Scanner;

class Milk extends Lactic {
    public double fat;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.init(scanner);
        fat = Double.valueOf(inSplit[2]);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + fat;
    }
}