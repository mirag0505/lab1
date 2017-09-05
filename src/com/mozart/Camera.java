package com.mozart;

import java.util.Scanner;

class Camera extends Technique {
    public int matrix;
    public double diaphragm;
    // возвращается состояние объекта в виде строки определяет толко в наследниках

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.name = inSplit[0];
        super.price = Integer.valueOf(inSplit[1]);
        this.matrix = Integer.valueOf(inSplit[2]);
        this.diaphragm = Double.valueOf(inSplit[3]);
    }

    public String toString() {
        return this.name + " " + this.price + " " + this.matrix + " " + this.diaphragm;
    }
}