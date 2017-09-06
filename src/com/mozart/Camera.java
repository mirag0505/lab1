package com.mozart;

import java.util.Scanner;

class Camera extends Technique {
    public int matrix;
    public double diaphragm;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.init(scanner);
        matrix = Integer.valueOf(inSplit[2]);
        diaphragm = Double.valueOf(inSplit[3]);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + matrix + " " + diaphragm;
    }
}