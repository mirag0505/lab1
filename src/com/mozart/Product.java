package com.mozart;

import java.util.Scanner;

public abstract class Product {
    public String name;
    public int price;

    // считывание параметров с консоли (вводятся характеристики товара)
    public abstract void init(Scanner scanner);

    //возвращает стоимость товара
    public abstract int getCost();

    // определяет, можно ли купить товар за имеющуюся сумму
    public abstract boolean canBuy(int cost);
}
