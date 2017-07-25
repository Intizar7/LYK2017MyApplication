package tr.org.linux.kamp.fizzbuzz;

import java.util.Scanner;

//Syso yaz ctrl+boşluk "System.out.println();" açılır

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi=input.nextInt();
		
		for(int i=1;i<=sayi;i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz " +i);
			}
			
			else if(i%3 == 0) {
				System.out.println("Fizz "+i);
			}
			else if(i%5 == 0) {
				System.out.println("Buzz "+i);
			}
			
			
		}
	}

}
