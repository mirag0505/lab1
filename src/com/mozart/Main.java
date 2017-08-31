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

            switch (createProd) {
                case "Toy":
                    System.out.println("Enter characteristics in a space: name lego, price lego, number of details in lego");
                    Lego productLego = new Lego();
                    Scanner scannerLego = new Scanner(System.in);
                    productLego.init(scannerLego);
                    arrayObj[i] = productLego;
                    break;
                case "Technique":
                    System.out.println("What technique do you want to create?: Camera, Laptop");
                    Scanner createTech = new Scanner(System.in);
                    String selectionTech = createTech.nextLine();

                    switch (selectionTech) {
                        case "Camera":
                            System.out.println("Enter characteristics in a space: name camera, price camera, matrix camera, diaphragm(1.0)");
                            Camera productCamera = new Camera();
                            Scanner scannerCamera = new Scanner(System.in);
                            productCamera.init(scannerCamera);
                            arrayObj[i] = productCamera;
                            break;
                        case "Laptop":
                            System.out.println("Enter characteristics in a space: name laptop, price laptop, diogonal(1.0), cpu(1.0)");
                            Laptop productLaptop = new Laptop();
                            Scanner scannerLaptop = new Scanner(System.in);
                            productLaptop.init(scannerLaptop);
                            arrayObj[i] = productLaptop;
                            break;
                        case "default":
                            throw new IllegalArgumentException("Invalid input");
                    }
                    break;
                case "Lactic":
                    System.out.println("What technique do you want to create?: Kefir, Milk");
                    Scanner createLactic = new Scanner(System.in);
                    String selectionLactic = createLactic.nextLine();

                    switch (selectionLactic) {
                        case "Kefir":
                            System.out.println("Enter characteristics in a space: name kefir, price kefir, alcohol kefir(1.0)");
                            Kefir productKefir = new Kefir();
                            Scanner scannerKefir = new Scanner(System.in);
                            productKefir.init(scannerKefir);
                            arrayObj[i] = productKefir;
                            break;
                        case "Milk":
                            System.out.println("Enter characteristics in a space: name milk, price milk, fat content(1.0) milk");
                            Milk productMilk = new Milk();
                            Scanner scannerMilk = new Scanner(System.in);
                            productMilk.init(scannerMilk);
                            arrayObj[i] = productMilk;
                            break;
                        case "default":
                            throw new IllegalArgumentException("Invalid input");
                    }
                    break;
                case "default":
                    throw new IllegalArgumentException("Invalid input");
            }
        }

        System.out.println("Cost product = " + arrayObj[0].getCost());
        System.out.println("Xvatit money? - " + arrayObj[0].canBuy(200));


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
