import java.util.Scanner;

public class ciftteksayi {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int number = 0;
		String answer = "";
		do {
			Scanner console = new Scanner(System.in);
			System.out.print("Numara girin: ");
			number = console.nextInt();
			if(number%2 == 0) {
				sumEven += number;
			} else {
				sumOdd += number;
			}
			System.out.println("Devam etmek istiyor musun? (Y/N)");
			Scanner konsol = new Scanner(System.in);
			answer = konsol.nextLine();

		} while(answer.equalsIgnoreCase("Y"));
		System.out.println("Çift sayıların toplamı: " + sumEven);
		System.out.println("Tek sayıların toplamı: " + sumOdd);
	}
}