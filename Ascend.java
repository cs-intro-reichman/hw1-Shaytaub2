// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); //lim>0
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int a1 = Math.max(a, Math.max(b,c));
		int c1 = Math.min(a, Math.min(b,c));
		int b1 = Math.max((Math.min(a,Math.max(b,c))), (Math.min(b,Math.max(a,c)))); // coverd all the options that can be
		System.out.println(a + " " + b + " " + c);
		System.out.println(c1 + " " + b1 + " " + a1);

	}
}
