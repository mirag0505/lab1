package com.mozart;

import java.util.Scanner;

public abstract class Product {
    public String name;
    public int price;

    //fixme Так не пойдет. Делай метод так, чтобы ты не дублировал один и тот же код в классах-наследниках
    // У тебя все эти поля общие, почему бы не сделать инициализацию name и price прям тут и вызывать потом super.init(scanner)?

    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        name = inSplit[0];
        price = Integer.valueOf(inSplit[1]);
    }

    public abstract int getCost();

    public abstract boolean canBuy(int cost);

}
