package com.mozart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inQua = new Scanner(System.in);
        System.out.println("Enter quantity of Products: ");
        int prodQua = inQua.nextInt();
        Product arrayObj[] = new Product[prodQua];

        for (int i = 0; i < prodQua; i++) {
            System.out.println("What product do you want to create?: Toy, Technique, Lactic?");
            Scanner inCreate = new Scanner(System.in);
            String createProd = inCreate.nextLine();

            // Попробуй разбить этот огромный switch на что-то более-менее удобочитаемое:) экстракция методов-наше все
            Scanner scanner = new Scanner(System.in);
            switch (createProd) {
                case "Toy":
                    System.out.println("Enter characteristics in a space: name lego, price lego, number of details in lego");
                    Lego productLego = new Lego();
                    // Зачм тебе новый сканер каждый раз? Создай один экземпляр перед switch и все
                    productLego.init(scanner);
                    arrayObj[i] = productLego;
                    break;
                case "Technique":
                    System.out.println("What technique do you want to create?: Camera, Laptop");
                    String selectionTech = scanner.nextLine();

                    switch (selectionTech) {
                        case "Camera":
                            // Если решил уж сделать так, то делай это внутри метода init. Я про вывод
                            System.out.println("Enter characteristics in a space: name camera, price camera, matrix camera, diaphragm(1.0)");
                            Camera productCamera = new Camera();
                            productCamera.init(scanner);
                            arrayObj[i] = productCamera;
                            break;
                        case "Laptop":
                            System.out.println("Enter characteristics in a space: name laptop, price laptop, diogonal(1.0), cpu(1.0)");
                            Laptop productLaptop = new Laptop();
                            productLaptop.init(scanner);
                            arrayObj[i] = productLaptop;
                            break;
                        case "default":
                            throw new IllegalArgumentException("Invalid input");
                    }
                    break;
                case "Lactic":
                    System.out.println("What technique do you want to create?: Kefir, Milk");
                    String selectionLactic = scanner.nextLine();

                    switch (selectionLactic) {
                        case "Kefir":
                            System.out.println("Enter characteristics in a space: name kefir, price kefir, alcohol kefir(1.0)");
                            Kefir productKefir = new Kefir();
                            productKefir.init(scanner);
                            arrayObj[i] = productKefir;
                            break;
                        case "Milk":
                            System.out.println("Enter characteristics in a space: name milk, price milk, fat content(1.0) milk");
                            Milk productMilk = new Milk();
                            productMilk.init(scanner);
                            arrayObj[i] = productMilk;
                            break;
                        case "default":
                            //Не лучший вариант - выбрасывать исключение. Попробуй придумать, как заставить пользователя ввести еще раз,
                            // сказав ему о том, что он ввел херню
                            System.out.println("Pidor vvedi norm dannyy!");
                    }
                    break;
                case "default":
                    throw new IllegalArgumentException("Invalid input");
            }
        }

        System.out.println("Cost product = " + arrayObj[0].getCost());
        // Что за параметр "200"?
        int youHaveManey = 200;
        System.out.println("Xvatit money? - " + arrayObj[0].canBuy(youHaveManey));


        int cost = 0;
        int numberMaxObj = 0;
        for (int i = 0; i < arrayObj.length; i++) {
            if (arrayObj[i].price > cost) {
                numberMaxObj = i;
                cost = arrayObj[i].price;
            }
        }
        System.out.println(arrayObj[numberMaxObj].toString());

    }
}
