import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.next());

		if (a % 400 == 0)
			System.out.println("閏年");
		else if (a % 100 == 0)
			System.out.println("非閏年");
		else if (a % 4 == 0)
			System.out.println("閏年");
		else
			System.out.println("非閏年");

		System.exit(0);
	}

}
