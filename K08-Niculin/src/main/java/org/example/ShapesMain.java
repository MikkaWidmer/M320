package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ShapesMain {
    public static void main(String[] args) {
        Circle circle = null;
        Triangle triangle = null;
        String eingabeKind;

        ShapeCollection shapeCollection = new ShapeCollection();
        do {
            System.out.println("Typ: ");
            eingabeKind = new Scanner(System.in).next();
            String toUppercaseKind = eingabeKind.toUpperCase(Locale.ROOT);
            switch (toUppercaseKind) {
                case "DREIECK" -> {
                    System.out.println("Kathete1: ");
                    int eingabeKathete1 = new Scanner(System.in).nextInt();
                    System.out.println("Kathete2: ");
                    int eingabeKathete2 = new Scanner(System.in).nextInt();
                    System.out.println("Hypothenuse: ");
                    int eingabeHypothenuse = new Scanner(System.in).nextInt();
                    System.out.println("Höhe: ");
                    int eingabeHoehe = new Scanner(System.in).nextInt();
                    System.out.println("x: ");
                    int eingabex = new Scanner(System.in).nextInt();
                    System.out.println("y: ");
                    int eingabey = new Scanner(System.in).nextInt();
                    triangle = new Triangle(eingabeKathete1, eingabeKathete2, eingabeHypothenuse, eingabeHoehe, eingabeKind, eingabex, eingabey);
                    shapeCollection.addShape(triangle);
                }
                case "KREIS" -> {
                    System.out.println("Durmesser: ");
                    int eingabeDurchmesser = new Scanner(System.in).nextInt();
                    System.out.println("x: ");
                    int eingabex = new Scanner(System.in).nextInt();
                    System.out.println("y: ");
                    int eingabey = new Scanner(System.in).nextInt();
                    circle = new Circle(eingabeKind, eingabeDurchmesser, eingabex, eingabey);
                    shapeCollection.addShape(circle);
                }

                default -> {
                    System.out.println("Must be 'Dreieck', or 'Kreis'");
                }
            }

        } while (!eingabeKind.equals("finish"));

        shapeCollection.printCollection();
        assert circle != null;
        assert triangle != null;
        System.out.println(triangle.getBoundigBox());
        System.out.println("Superboundingbox: " + shapeCollection.getSuperBoundigngBox());
        triangle.countCorners();
    }
}
