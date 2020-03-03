import java.util.Scanner;

public class dizibuyuktenkucuge {
	public static void main(String args[]) {
		int[] dizi = new int[5];
		int temp = 0;
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". sayıyı giriniz: ");
			dizi[i] = console.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			for (int x = 1; x < 5; x++) {
				if (dizi[x - 1] > dizi[x]) {
					temp = dizi[x];
					dizi[x] = dizi[x - 1];
					dizi[x - 1] = temp;
				}
			}
		}
		System.out.println("Küçükten büyüğe sıralama: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(dizi[i] + "\t");
		}
	}
}