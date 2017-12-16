

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String number1= JOptionPane.showInputDialog("type in a number");
		String number2 = JOptionPane.showInputDialog("type in a second number");
		int number_1 =Integer.parseInt(number1);
		int number_2 = Integer.parseInt(number2);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation==2) {
			multiply(number_1,number_2);
		}
		if(operation==1) {
			subtract( number_1, number_2);
		}
		if(operation==3)
			divide(number_1,number_2);
	
		if(operation==0) {
			add(number_1,number_2);}
	}
		 
		 
	
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 + "+" + number2 + "=" + (number1+number2));
	}
	static void subtract(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1+ "-"+number2+ "="+ (number1-number2));
	} 	
	static void multiply(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1+ "*" + number2+ "="+ (number1*number2));
	}
	static void divide(int number1, int number2) {
			
		JOptionPane.showMessageDialog(null, number1+ "/"+ number2 + "="+ (number1/number2));
	}


	// 4. Create similar methods for subtraction, multiplication and division.
}