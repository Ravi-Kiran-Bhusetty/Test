import java.util.Scanner;

public class CatsMouse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouseC = sc.nextInt();
		int a = Math.abs(mouseC-catA);
		int b = Math.abs(mouseC-catB);
		if(a<b)
			System.out.println("Cat A");
		else if(a>b)
			System.out.println("Cat B");
		else
			System.out.println("Mouse C");
	}

}
