import java.util.*;

public class SimpleCalcII {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numeric value: ");
		double operand1 = scanner.nextDouble();
		System.out.println("Enter a numeric value: ");
		double operand2 = scanner.nextDouble();
		System.out.println("Choose operation (+, -, /, *): ");
		String operation = scanner.next();
		switch (operation) {
			case "+":
				System.out.println("Result: " + String.valueOf(operand1 + operand2));
				break;
			case "-":
				System.out.println("Result: " + String.valueOf(operand1 - operand2));
				break;
			case "/":
				if(operand2 == 0.0) {
					System.out.println("Result: undefined");
				}else{
					System.out.println("Result: " + String.valueOf(operand1 / operand2));
				}
				break;
			case "*":
				System.out.println("Result: " + String.valueOf(operand1 * operand2));
				break;
			default:
				break;
		}
	}
}