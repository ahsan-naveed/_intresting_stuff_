import java.util.*;

public class SimpleCalc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numeric value: ");
		double operand1 = scanner.nextDouble();
		System.out.println("Enter a numeric value: ");
		double operand2 = scanner.nextDouble();
		System.out.println("Result: " + String.valueOf(operand1+operand2));
	}
}