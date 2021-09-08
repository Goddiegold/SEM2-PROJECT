import java.util.Scanner;

public class Decimal_Binary {

	public void dec_bin() {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter decimal num: ");
		int num = scanner.nextInt();
		System.out.println(Integer.toBinaryString(num));
	}

}
