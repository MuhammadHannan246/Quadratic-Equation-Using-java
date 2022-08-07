import java.util.*;

class Equation{
	double a;
	double b;
	public Equation(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void CalculateMethod() {
		double ans = (Math.pow(a, 2)) - (2)*(a)*(b) + (Math.pow(b, 2));
		
		System.out.println("Answer of equation is: "+ans);
		
		
	}

	public void Display() {
		CalculateMethod();
	}
}

public class Test {

	public static void main(String[] args) {

		Scanner d1 = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter value of a: ");
		double aval = d1.nextDouble();
		System.out.println("Enter value of b: ");
		double bval = d1.nextDouble();
		
		Equation obj1 = new Equation(aval,bval);
		obj1.Display();

		System.out.println();
		System.out.println("Enter value of a: ");
		double aval1 = d1.nextDouble();
		System.out.println("Enter value of b: ");
		double bval1 = d1.nextDouble();

		Equation obj2 = new Equation(aval1,bval1);
		obj2.Display();
		

	}

}
