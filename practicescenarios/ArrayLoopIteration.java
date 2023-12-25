package practicescenarios;

public class ArrayLoopIteration {

	public static void main(String[] args) {
		int[][] sample = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				System.out.println(sample[i][j]);
			}
		}
	}

}
