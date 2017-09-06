package com.mozart;

import java.util.Scanner;


class Lego extends Toy {

    public int numberOfDetails;

    @Override
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        super.init(scanner);
        numberOfDetails = Integer.valueOf(inSplit[2]);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + numberOfDetails;
    }
}
