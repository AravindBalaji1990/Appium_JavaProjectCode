package BasicScripts;

public class BackwardPyramid {

	public static void main(String[] args) {
		for(int x=9;x>=0;x--){
			for(int y=0;y<x;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
