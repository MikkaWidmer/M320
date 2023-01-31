package org.example;

import java.util.Locale;
import java.util.Scanner;

public class CalculateLoop {
	private Circle circle = null;
	private Triangle triangle = null;
	private int totalCorners;

	ShapeCollection shapeCollection = new ShapeCollection();

	/**
	 * this is the main application method
	 * @throws InvalidTypeException
	 */
	public void run() throws InvalidTypeException {
		String eingabeKind;
		do {
			System.out.println("Possible Types:\n Dreieck\n Kreis");
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
					triangle.countCorners();
					totalCorners += triangle.getCorners();
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
					circle.countCorners();
					totalCorners += circle.getCorners();
				}

				case "FINISH" -> {
					showResult();
				}

				default -> {
					throw new InvalidTypeException("Must be 'Dreieck', or 'Kreis'");
				}
			}
			System.out.println("write finish for exit");
		} while (!eingabeKind.equals("finish"));

	}

	/**
	 * shows bounding boxes
	 */
	private void showResult() {
		shapeCollection.printCollection();
		if (triangle.getBoundigBox() != null||circle.getBoundigBox() != null){
			System.out.println(triangle.getBoundigBox());
			System.out.println(circle.getBoundigBox());
		} else {
			throw new RuntimeException("there is a empty boundingbox");
		}
		System.out.println("Superboundingbox: " + shapeCollection.getSuperBoundigngBox());
		System.out.println("total corners: " + totalCorners);
	}

}
