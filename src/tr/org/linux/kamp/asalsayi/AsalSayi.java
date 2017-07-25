package tr.org.linux.kamp.asalsayi;

import java.util.Scanner;

public class AsalSayi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int number = input.nextInt();

		int say = 0;
		// int num=2;
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				say++;
				System.out.println("Asal sayi:" + i);
			}
			say++;
		}
	}
}
