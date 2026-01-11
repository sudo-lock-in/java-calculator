import java.util.Scanner;

public class MyCalculator {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char startOver = 'Y'; //initialized this so the loop will start
		while (startOver == 'Y') {
			startOver = 'X'; //using X as a placeholder value to prevent infinite loop
			//it will only start over again if the user inputs Y for the startOver value
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			String inputMode = scnr.next();
			if (inputMode.equalsIgnoreCase("Scientific")) {
				//i use .equalsIgnoreCase to account for any caps lock or shift key typos during input for the mode
				System.out.println("The calculator will operate in scientific mode."); 
				inputMode = "Scientific";
				//the while statements also allow the prompt to repeat if there is an invalid operator
				while (inputMode == "Scientific") {
					inputMode = ""; //prevents infinite loop
					System.out.println("Enter '+' for addition,"
							+ " '-' for subtractions,"
							+ " '*' for multiplication,"
							+ " '/' for division,"
							+ " 'sin' for sin x,"
							+ " 'cos' for cos x,"
							+ " 'tan' for tan x:");
					String inputOperator = scnr.next();
					if (inputOperator.equals("+")) {
						System.out.println("How many numbers do you want to add?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						//numberAmount - 1 is to account for the first input for the result being initialized outside of loop
						 result = result + scnr.nextDouble(); //the result will keep being updated with itself + the next input
						 //iteration 1- result = first input + second input
						 //iteration 2- result = (first input + second input) + third input
						 //and so on...
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("-")) {
						System.out.println("How many numbers do you want to subtract?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) {
						 result = result - scnr.nextDouble();
						} System.out.println("Result: " + result); 
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("*")) {
						System.out.println("How many numbers do you want to multiply?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result * scnr.nextDouble();
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("/")) {
						System.out.println("How many numbers do you want to divide?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result / scnr.nextDouble();
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("sin")) { 
						System.out.println("Enter a number in radians to find the sine");
						double result = Math.sin(scnr.nextDouble());
						System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("cos")) {
						System.out.println("Enter a number in radians to find the cosine");
						double result = Math.cos(scnr.nextDouble());
						System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.equals("tan")) {
						System.out.println("Enter a number in radians to find the tangent");
						double result =  Math.tan(scnr.nextDouble());
						System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else { 
						System.out.println("Invalid operator " + inputOperator);
						inputMode = "Scientific"; //re-prompts
					} 
				}
			} else  {
				System.out.println("The calculator will operate in standard mode."); 
				//if there is a typo/wrong input or you input "Standard", the calculator will go to standard mode
				inputMode = "Standard";
				while (inputMode == "Standard") {
					inputMode = ""; 
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
					String inputOperator = scnr.next(); 
					if (inputOperator.charAt(0) == '+' && inputOperator.length() == 1) { 
						System.out.println("How many numbers do you want to add?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result + scnr.nextDouble(); 
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0); 
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.charAt(0) == '-' && inputOperator.length() == 1) {
						System.out.println("How many numbers do you want to subtract?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result - scnr.nextDouble();
						} System.out.println("Result: " + result); 
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.charAt(0) == '*' && inputOperator.length() == 1) {
						System.out.println("How many numbers do you want to multiply?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result * scnr.nextDouble();
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else if (inputOperator.charAt(0) == '/' && inputOperator.length() == 1) {
						System.out.println("How many numbers do you want to divide?");
						int numberAmount = scnr.nextInt();
						System.out.println("Enter " + numberAmount + " numbers");
						double result = scnr.nextDouble();
						for (int i = 0; i < numberAmount - 1; i++) { 
						 result = result / scnr.nextDouble();
						} System.out.println("Result: " + result);
						System.out.println("Do you want to start over? (Y/N)");
						startOver = scnr.next().charAt(0);
						if (startOver == 'N') {
							System.out.println("Goodbye");
						}
					} else { 
						System.out.println("Invalid operator " + inputOperator);
						inputMode = "Standard"; 
					}
				} 
			}		
	}
}
}

