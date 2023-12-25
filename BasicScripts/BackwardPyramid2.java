package BasicScripts;

public class BackwardPyramid2 {

	public static void main(String[] args) {
		for(int x=9;x>=0;x--){
			for(int y=0;y<x;y++){
				System.out.print("");
			}
			for (int k = 1; k <= (2 * x - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
