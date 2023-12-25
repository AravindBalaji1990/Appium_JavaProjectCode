package ConvertFromOneDataTypeToAnother;

import java.text.DecimalFormat;

public class DecimalCorrectToDecimalPlaces {

	public static void main(String[] args) {
		// double a =100.12;
		double c = 101.6223442352345;
		DecimalFormat format = new DecimalFormat("0.#####");
		System.out.println(format.format(c));
		//System.out.println(Math.round(c));
	}

}
