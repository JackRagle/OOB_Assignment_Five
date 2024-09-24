package MultiplicationInAction;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		
		int columnOne, columnTwo, rowOne, rowTwo = 0;
		
		System.out.println("Welcome to the Matrix Multiplication Tool!");
		System.out.println("Enter two files names seperated by ' x ' to multiply the matrices together.");
		System.out.println("Or, if you would like to multiply two random matrices, enter the size of the first column. Must be between 0 and 9.");

		input = in.nextLine();
		
		boolean isNumber = false;
		
		try {
			Double.parseDouble(input);
			isNumber = true;
		}catch(NumberFormatException e) {
			isNumber = false;
		}
		
		if(isNumber) {
			columnOne = (int) input.charAt(0) - 48;
			//ASCII value of one through nine is forty-nine through fifty-seven.
			
			System.out.println("Please enter the size of the first row.");
			rowOne = in.nextInt();
			System.out.println("Please enter the size of the second column.");
			columnTwo = in.nextInt();
			System.out.println("Please enter the size of the second row.");
			rowTwo = in.nextInt();
			System.out.println((int) columnOne + "x" + rowOne + " by " + columnTwo + "x" + rowTwo);
		}
		
		in.close();
	}

}
