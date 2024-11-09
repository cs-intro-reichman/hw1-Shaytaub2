// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int numWord = Integer.parseInt(args[0]);
		int ones = numWord%10;
		int tens = (numWord-ones)%100/10;
		int hundreds = (numWord-ones-(tens*10))%1000/100;
		System.out.println(hundreds + " hundreds, " + tens +" tens, and "+ ones + " ones.");
	}
}
