package tr.org.linux.kamp.loops;

public class WhileCounter {

	public static void main(String[] args) {
		int counter = 1;

		while (counter <= 10) {
			System.out.println(counter);
			++counter;
		}
	}
}