package ProblemStatement;

import java.text.DecimalFormat;

public class ProblemStatement {
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private float totalWeight;
	private String arrivalPort;
	private String departurePort;
	private static int nextShipmentId = 1000;

	public ProblemStatement(int id, String shipperName, String modeOfTransportation, float totalWeight,
			String arrivalPort, String departurePort) {
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;

	}

	public static ProblemStatement createNewShipment(String shipperName, String modeOfTransportation, Float totalWeight,
			String arrivalPort, String departurePort) {

		nextShipmentId++;
		int id = nextShipmentId;
		ProblemStatement sh = new ProblemStatement(id, shipperName, modeOfTransportation, totalWeight, arrivalPort,
				departurePort);
		return sh;
	}

	public String toString() {
		DecimalFormat format = new DecimalFormat("0.##");
		String weight = format.format(this.totalWeight);

		return String.format(("%-15d%-15s%-25s%-15s%-20s%s"), this.id, this.shipperName, this.modeOfTransportation,
				weight + "Kg", this.arrivalPort, this.departurePort);

	}
}
