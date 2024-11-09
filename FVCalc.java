
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args [0]);
		double rate = Double.parseDouble(args [1]);  // 0<=rate<=100
		int years = Integer.parseInt (args [2]); // in the hw page 'n' is the number of years.
		double f = currentValue*Math.pow((rate/100+1),years); //temp integer for the formula.
		int futureValue = (int) f;
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + rate + "% will yeald $" + futureValue + " ");
	}
}