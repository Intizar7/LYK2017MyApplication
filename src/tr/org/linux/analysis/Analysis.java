package tr.org.linux.analysis;

import java.util.*;

public class Analysis {
	//ctrl+boşluk main yaratır
	
	public static void main(String[] args) {
		int passes=0;
		int failures=0;
		int studentCounter=1;
		int result;
		Scanner input=new Scanner(System.in);
		
		while(studentCounter<=10) {
			System.out.println("Sonucu giriniz,1=geçti,2=kaldı");
			result = input.nextInt();
			if(result == 1) {
				passes = passes + 1;
				studentCounter = studentCounter + 1;
			}
			else if(result == 2) {
				failures = failures + 1;
				studentCounter = studentCounter + 1;
			}
			else System.out.println("Lütfen 1 ya da 2 olarak giriniz");
		}
		
		System.out.println("Geçenler: " + passes);
		System.out.println("Kalanlar: " + failures);
		
		}
	}


