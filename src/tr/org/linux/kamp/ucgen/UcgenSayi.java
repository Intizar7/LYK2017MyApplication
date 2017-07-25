package tr.org.linux.kamp.ucgen;

import java.util.*;

public class UcgenSayi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");

		int sayi = input.nextInt();
		int satir = 6;

		int i,j,k;
		for (i = satir; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.println(j + " ");
			}
			for(k=2;k<=i;k++) {
				System.out.println(k+" ");
			}
			System.out.println("\t");
		}
	}

}
