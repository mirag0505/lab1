package com.mozart;

import java.util.Scanner;

class Laptop extends Technique {
    public double diagonal;
    public double cpu;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.init(scanner);
        diagonal = Double.valueOf(inSplit[2]);
        cpu = Double.valueOf(inSplit[3]);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + diagonal + " " + cpu;
    }
}