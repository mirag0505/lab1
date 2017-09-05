package com.mozart;

import java.util.Scanner;

public abstract class Product {
    public String name;
    public int price;

    //fixme Так не пойдет. Делай метод так, чтобы ты не дублировал один и тот же код в классах-наследниках
    // У тебя все эти поля общие, почему бы не сделать инициализацию name и price прям тут и вызывать потом super.init(scanner)?
    
    // считывание параметров с консоли (вводятся характеристики товара)
    public void init(Scanner scanner) {
        String input = scanner.nextLine();
        String inSplit[] = input.split(" ");
        this.name = inSplit[0];
        this.price = Integer.valueOf(inSplit[1]);
    }

    //возвращает стоимость товара
    public abstract int getCost();

    // определяет, можно ли купить товар за имеющуюся сумму
    public abstract boolean canBuy(int cost);
    
    // И где Override метода toString?
}
