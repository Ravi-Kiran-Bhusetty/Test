import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 1; i < ch.length; i++) {

			if (ch[i] == 'O') {

				if (ch[i - 1] != 'S') {
					count++;
				}
				if (ch[i + 1] != 'S') {
					count++;
				}
				i += 2;
			} else {
				count++;
				if (ch[i - 1] != 'S') {
					count++;
				}
				if (ch[i + 1] != 'S') {
					count++;
				}
				i += 2;
			}
		}
		System.out.println(count);

	}

}
