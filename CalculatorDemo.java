package Exception;
class Calculator{
	int left;
	int right;

	public void setOprnads(int left, int right) {

		this.left = left;
		this.right = right;
		
	}


public void divide() {
	try {
	System.out.print(" �������");
	System.out.print(this.left/this.right);
	System.out.print("�Դϴ�.");
	}catch(Exception e){
	System.out.print("\n\ne.getMessage()");
	System.out.print("\n\ne.toString()");
	System.out.print("\n\ne.printStackTrace()");
	e.printStackTrace();
}
}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprnads(10, 0);	// (10,0) ArithmeticException
		c1.divide();
	}

}
