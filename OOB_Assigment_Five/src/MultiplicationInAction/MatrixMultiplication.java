package MultiplicationInAction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Matrix Multiplication Tool!");
		
		if(args.length == 2) {
			
			int rowOne, columnOne, rowTwo, columnTwo;
			
			System.out.println("Please enter the number of columns in the first matrix. Must be greater than 0.");
			rowOne = in.nextInt();
			if(rowOne < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			System.out.println("Please enter the number of rows in the first matrix. Must be greater than 0.");
			columnOne = in.nextInt();
			if(columnOne < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			columnTwo = rowOne;
			System.out.println("Please enter the number of columns in the second matrix. Must be greater than 0.");
			rowTwo = in.nextInt();
			if(rowTwo < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			
			in.close();
			
			File firstMatrix = new File(args[0]);
			Scanner inOne = new Scanner(firstMatrix);
			
			int[][] matrixOne = new int[columnOne][rowOne], matrixTwo = new int[columnTwo][rowTwo];
			System.out.println("The first matrix is:");
			for(int i = 0; i < columnOne; i++) {
				for(int j = 0; j < rowOne; j++) {
					matrixOne[i][j] = inOne.nextInt();
					System.out.print(matrixOne[i][j] + " ");
				}
				System.out.println("");
			}
			inOne.close();
			
			File secondMatrix = new File(args[1]);
			Scanner inTwo = new Scanner(secondMatrix);
			
			System.out.println("The second matrix is:");
			for(int i = 0; i < columnTwo; i++) {
				for(int j = 0; j < rowTwo; j++) {
					matrixTwo[i][j] = inTwo.nextInt();
					System.out.print(matrixTwo[i][j] + " ");
				}
				System.out.println("");
			}
			inTwo.close();
			
			BufferedWriter outProduct = new BufferedWriter(new FileWriter("MatrixProduct.txt"));
			System.out.println("\nThe product of matrix one times matrix two is:");
			int[][] matrixProduct = new int[columnOne][rowTwo];
			for(int a = 0; a < columnOne; a++) {
				for(int b = 0; b < rowTwo; b++) {
					for(int c = 0; c < rowOne; c++) {
						matrixProduct[a][b] += matrixOne[a][c] * matrixTwo[c][b];
					}
					outProduct.write(matrixProduct[a][b] + " ");
					System.out.print(matrixProduct[a][b] + " ");
				}
				outProduct.write("\n");
				System.out.println("");
			}
			outProduct.close();
			
		}else {
			
			int columnOne, columnTwo, rowOne, rowTwo = 0;
			
			System.out.println("Please enter the number of columns in the first matrix. Must be greater than 0.");
			rowOne = in.nextInt();
			if(rowOne < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			System.out.println("Please enter the number of rows in the first matrix. Must be greater than 0.");
			columnOne = in.nextInt();
			if(columnOne < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			columnTwo = rowOne;
			System.out.println("Please enter the number of columns in the second matrix. Must be greater than 0.");
			rowTwo = in.nextInt();
			if(rowTwo < 1) {
				in.close();
				throw new Exception("Number must be greater than 0.");
			}
			in.close();
			
		
			BufferedWriter outOne = new BufferedWriter(new FileWriter("MatrixOne.txt"));
			int[][] matrixOne = new int[columnOne][rowOne], matrixTwo = new int[columnTwo][rowTwo];
			System.out.println("The first matrix is:");
			for(int i = 0; i < columnOne; i++) {
				for(int j = 0; j < rowOne; j++) {
					matrixOne[i][j] = (int) (Math.random() * 10);
					outOne.write(matrixOne[i][j] + " ");
					System.out.print(matrixOne[i][j] + " ");
				}
				outOne.write("\n");
				System.out.println("");
			}
			outOne.close();
			BufferedWriter outTwo = new BufferedWriter(new FileWriter("MatrixTwo.txt"));
			System.out.println("The second matrix is:");
			for(int i = 0; i < columnTwo; i++) {
				for(int j = 0; j < rowTwo; j++) {
					matrixTwo[i][j] = (int) (Math.random() * 10);
					outTwo.write(matrixTwo[i][j] + " ");
					System.out.print(matrixTwo[i][j] + " ");
				}
				outTwo.write("\n");
				System.out.println("");
			}
			outTwo.close();
			BufferedWriter outProduct = new BufferedWriter(new FileWriter("MatrixProduct.txt"));
			System.out.println("\nThe product of matrix one times matrix two is:");
			int[][] matrixProduct = new int[columnOne][rowTwo];
			for(int a = 0; a < columnOne; a++) {
				for(int b = 0; b < rowTwo; b++) {
					for(int c = 0; c < rowOne; c++) {
						matrixProduct[a][b] += matrixOne[a][c] * matrixTwo[c][b];
					}
					outProduct.write(matrixProduct[a][b] + " ");
					System.out.print(matrixProduct[a][b] + " ");
				}
				outProduct.write("\n");
				System.out.println("");
			}
			outProduct.close();
		
		}

	}
}
