package MultiplicationInAction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		//Creation of input stream from the command line
		
		System.out.println("Welcome to the Matrix Multiplication Tool!");
		
		if(args.length == 2) {
			//Checks if the user has inputed two arguments
			
			int rowOne, columnOne, rowTwo, columnTwo;
			//Creation of matrix dimensions
			
			System.out.println("Please enter the number of columns in the first matrix. Must be greater than 0.");
			rowOne = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(rowOne < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			System.out.println("Please enter the number of rows in the first matrix. Must be greater than 0.");
			columnOne = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(columnOne < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			columnTwo = rowOne;
			//For matrix multiplication to happen this must be true
			System.out.println("Please enter the number of columns in the second matrix. Must be greater than 0.");
			rowTwo = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(rowTwo < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			
			in.close();
			//Closes the input stream from the command line
			
			File firstMatrix = new File(args[0]);
			Scanner inOne = new Scanner(firstMatrix);
			//Creation of input stream from the first argument file
			
			int[][] matrixOne = new int[columnOne][rowOne], matrixTwo = new int[columnTwo][rowTwo];
			//Creation of the two matrices
			System.out.println("The first matrix is:");
			for(int i = 0; i < columnOne; i++) {
				for(int j = 0; j < rowOne; j++) {
					matrixOne[i][j] = inOne.nextInt();
					System.out.print(matrixOne[i][j] + " ");
					//Reads integers in order from the argument file, assigns them to the matrix that was created, and prints them as it goes
				}
				System.out.println("");
			}
			inOne.close();
			//Closes the input stream from the argument file
			
			File secondMatrix = new File(args[1]);
			Scanner inTwo = new Scanner(secondMatrix);
			//Creation of input stream from the second argument file
			
			System.out.println("The second matrix is:");
			for(int i = 0; i < columnTwo; i++) {
				for(int j = 0; j < rowTwo; j++) {
					matrixTwo[i][j] = inTwo.nextInt();
					System.out.print(matrixTwo[i][j] + " ");
					//Reads integers in order from the argument file, assigns them to the matrix that was created, and prints them as it goes
				}
				System.out.println("");
			}
			inTwo.close();
			//Closes the input stream from the argument file
			
			BufferedWriter outProduct = new BufferedWriter(new FileWriter("MatrixProduct.txt"));
			//Creation of output stream to "MatrixProduct.txt" file
			System.out.println("\nThe product of matrix one times matrix two is:");
			int[][] matrixProduct = new int[columnOne][rowTwo];
			//Creation of matrix to store the product of the multiplication
			for(int a = 0; a < columnOne; a++) {
				for(int b = 0; b < rowTwo; b++) {
					for(int c = 0; c < rowOne; c++) {
						matrixProduct[a][b] += matrixOne[a][c] * matrixTwo[c][b];
						//Computes the product element by element
					}
					outProduct.write(matrixProduct[a][b] + " ");
					System.out.print(matrixProduct[a][b] + " ");
					//Outputs the results to the console and the output file
				}
				outProduct.write("\n");
				System.out.println("");
			}
			outProduct.close();
			//Closes the output stream to the output file
			
		}else {
			//Assumes that there are no arguments
			
			int columnOne, columnTwo, rowOne, rowTwo = 0;
			//Creation of matrix dimensions
			
			System.out.println("Please enter the number of columns in the first matrix. Must be greater than 0.");
			rowOne = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(rowOne < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			System.out.println("Please enter the number of rows in the first matrix. Must be greater than 0.");
			columnOne = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(columnOne < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			columnTwo = rowOne;
			//For matrix multiplication to happen this must be true
			System.out.println("Please enter the number of columns in the second matrix. Must be greater than 0.");
			rowTwo = in.nextInt();
			//Reads user input and assigns it to the matrix size
			if(rowTwo < 1) {
				//Checks if the user has inputed a valid size and throws an exception if that is not the case
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			in.close();
			//Closes the input stream from the command line
			
			BufferedWriter outOne = new BufferedWriter(new FileWriter("MatrixOne.txt"));
			//Creation of output stream to "MatrixOne.txt" file
			int[][] matrixOne = new int[columnOne][rowOne], matrixTwo = new int[columnTwo][rowTwo];
			//Creation of matrices that will be multiplied
			System.out.println("The first matrix is:");
			for(int i = 0; i < columnOne; i++) {
				for(int j = 0; j < rowOne; j++) {
					matrixOne[i][j] = (int) (Math.random() * 10);
					outOne.write(matrixOne[i][j] + " ");
					System.out.print(matrixOne[i][j] + " ");
					//Generates a random number between 0 and 9, assigns it to the specified location, and prints it to the output file and the console
					//Repeats for each location in the matrix
				}
				outOne.write("\n");
				System.out.println("");
			}
			outOne.close();
			//Closes the output stream to the output file
			
			BufferedWriter outTwo = new BufferedWriter(new FileWriter("MatrixTwo.txt"));
			//Creation of output stream to "MatrixTwo.txt" file
			System.out.println("The second matrix is:");
			for(int i = 0; i < columnTwo; i++) {
				for(int j = 0; j < rowTwo; j++) {
					matrixTwo[i][j] = (int) (Math.random() * 10);
					outTwo.write(matrixTwo[i][j] + " ");
					System.out.print(matrixTwo[i][j] + " ");
					//Generates a random number between 0 and 9, assigns it to the specified location, and prints it to the output file and the console
					//Repeats for each location in the matrix
				}
				outTwo.write("\n");
				System.out.println("");
			}
			outTwo.close();
			//Closes the output stream to the output file
			
			BufferedWriter outProduct = new BufferedWriter(new FileWriter("MatrixProduct.txt"));
			//Creation of output stream to "MatrixProduct.txt" file
			System.out.println("\nThe product of matrix one times matrix two is:");
			int[][] matrixProduct = new int[columnOne][rowTwo];
			for(int a = 0; a < columnOne; a++) {
				for(int b = 0; b < rowTwo; b++) {
					for(int c = 0; c < rowOne; c++) {
						matrixProduct[a][b] += matrixOne[a][c] * matrixTwo[c][b];
						//Computes the product element by element
					}
					outProduct.write(matrixProduct[a][b] + " ");
					System.out.print(matrixProduct[a][b] + " ");
					//Outputs the results to the console and the output file
				}
				outProduct.write("\n");
				System.out.println("");
			}
			outProduct.close();
			//Closes the output stream to the output file
		}

	}
}
