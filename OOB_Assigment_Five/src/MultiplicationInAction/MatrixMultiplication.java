package MultiplicationInAction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Welcome to the Matrix Multiplication Tool!");
		
		if(args.length == 2) {
			
			try {
				
				File inOne = new File(args[0]);
				File inTwo = new File(args[1]);
				
			}catch(IllegalArgumentException e) {
				
				System.out.println("The files that you have named do not exist.");
				
			}
			
			//Read values from the files and implement the matrix multiplication
			
		}else {
			
			Scanner in = new Scanner(System.in);
			
			int columnOne, columnTwo, rowOne, rowTwo = 0;
			
			System.out.println("If you would like to multiply two random matrices, enter the size of the first matrices' row(s). Must be greater than 0.");
			rowOne = in.nextInt();
			if(rowOne < 1) {
				in.close();
				throw new Exception("Size must be greater than 0.");
			}
			System.out.println("Please enter the size of the first matrices' column(s). Must be greater than 0.");
			columnOne = in.nextInt();
			if(columnOne < 1) {
				in.close();
				throw new Exception("Size must be greater than 0.");
			}
			columnTwo = rowOne;
			System.out.println("Please enter the size of the second matrices'row(s). Must be greater than 0.");
			rowTwo = in.nextInt();
			if(rowTwo < 1) {
				in.close();
				throw new Exception("Size must be greater than 0.");
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
