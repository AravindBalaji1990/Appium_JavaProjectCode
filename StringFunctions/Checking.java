package StringFunctions;

public class Checking {

	public static void main(String[] args) {
		String s = "GooGoo";
		int i, j, count;
		char[] ch = s.toCharArray();
		for (i = 0; i < ch.length; i++) {
			count = 1;
			for (j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j])
					count++;
			}
			if (count > 1) {
				System.out.println(ch[i] + count);
			}
		}
	}
}
