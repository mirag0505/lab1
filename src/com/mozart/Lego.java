package com.mozart;

import java.util.Scanner;


class Lego extends Toy {

    public int numberOfDetails;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.name = inSplit[0];
        super.price = Integer.valueOf(inSplit[1]);
        this.numberOfDetails = Integer.valueOf(inSplit[2]);
    }

    @Override
    public String toString() {
        return this.name + " " + this.price + " " + this.numberOfDetails;
    }
}
