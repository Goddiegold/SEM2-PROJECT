import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Binary_Decimal binDec = new Binary_Decimal();
		Decimal_Binary decBin = new Decimal_Binary();
		
		
		System.out.println("\t\t\tWelcome to the converter");
		System.out.println("Press 1(binary to decimal), Press 2 (decimal to binary)");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		
		
		switch(num) {
		case 1:
		binDec.bin_dec();
		break;
		
		case 2:
		decBin.dec_bin();
		break;
		
		default:
		System.out.println("Wrong Entry");
		}
		

	}

}
