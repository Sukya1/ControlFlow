class Calculator {
	
	public Calculator() {
			
	}
	public int add(int num1,int num2) {
		return num1 + num2;
	}
	public int subtract(int num1,int num2) {
		return num1 - num2;
	}
	public int multiply(int num1,int num2) {
		return num1 * num2;
	}
	public double divide(int num1,int num2) {
		return (double)num1/num2;
	}
	public int square(int num1) {
		return num1 * num1;
	}
}
class MagicCalculator extends Calculator {
	public MagicCalculator() {
	}
	public double squareRoot(double num) {
		return Math.sqrt(num);
	}
	public double sin(double num) {
		return Math.sin(num);
	}
	public double cosine(double num) {
		return Math.cos(num);
	}
	public double tangent(double num) {
		return Math.tan(num);
	}
	public int factorial(int num) {
		int res = 1;
		for(int i = num; i > 0; i--) {
			res *= i;
		}
		return res;
	}
	public static void main(String[] args) {
		MagicCalculator cal = new MagicCalculator();
		System.out.print(cal.add(3,4));
	}
}
	
