package ProblemStatement;

import java.util.Scanner;

public class ProblemStatement_main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int intNumber;
		String sName;
		String mot;
		float tw;
		String aP;
		String dP;

		System.out.println("Enter the number of shipments :");
		intNumber = scanner.nextInt();
		scanner.nextLine();
		ProblemStatement[] sh = new ProblemStatement[intNumber];
		for (int i = 0; i < intNumber; i++) {
			System.out.println("Enter the shipment " + (i + 1) + " details");
			System.out.println("Enter the shipper name :");
			sName = scanner.nextLine();
			System.out.println("Enter the mode of transportation :");
			mot = scanner.nextLine();
			System.out.println("Enter the total weight :");
			tw = scanner.nextFloat();
			scanner.nextLine();
			System.out.println("Enter the arrival port :");
			aP = scanner.nextLine();
			System.out.println("Enter the departure port :");
			dP = scanner.nextLine();
			sh[i] = ProblemStatement.createNewShipment(sName, mot, tw, aP, dP);
		}
		System.out.println("Shipment details are");
		System.out.format(("%-15s%-15s%-25s%-15s%-20s%s%n"), "Id", "Shippername", "Mode of transportation",
				"Total weight", "Arrival port", "Departure port");
		for (int j = 0; j < intNumber; j++) {
			System.out.println(sh[j]);
		}
		scanner.close();

	}
}
