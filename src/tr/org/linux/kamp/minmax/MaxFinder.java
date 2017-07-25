package tr.org.linux.kamp.minmax;

import java.util.*;

//saut ctrl+boşluk system.out.println(); yapar
public class MaxFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen aralara boşluk koyarak 3 sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = maximum(number1, number2, number3);

		System.out.println("En büyük sayı: " + result);

	}
  //& tek olduğunda ilk duruma bakiyor ilk koşul sağlandığında çalışır 
	//&& çift olduğunda her iki koşulun sağlanması gerekiyor
	
	private static double maximum(double x, double y, double z) {
		// TODO Auto-generated method stub
		
		double maximumValue = x;

		if (y > maximumValue)
			maximumValue = y;
		if (z > maximumValue)
			maximumValue = z;

		return maximumValue;
	}
}
