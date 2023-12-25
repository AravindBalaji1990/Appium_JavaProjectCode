package ConvertFromOneDataTypeToAnother;

import java.text.DecimalFormat;

public class TestDecimal {

	public static void main(String[] args) {
		double a = 999;
		double b = 2;
		double res = a / b;
		DecimalFormat df = new DecimalFormat("0.###");
		String data = df.format(res);
		System.out.println(data);

	}
}
