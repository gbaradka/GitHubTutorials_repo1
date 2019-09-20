package io.practo;

public class FinalMethodOverload {
	
	
	public final void calc(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public final void calc(double a, double b, double d) {
		double c = a+b+d;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {

		FinalMethodOverload obj = new FinalMethodOverload();
		obj.calc(12.12, 2323.232, 3434.33);
		
		
	}

}
