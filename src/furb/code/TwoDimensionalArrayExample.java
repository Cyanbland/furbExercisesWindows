package furb.code;

/*Declare uma matriz B, também de ordem 3 X 3. Leia os números da matriz
Depois de carregadas as matriz A e B, calcule a matriz C tal que C = A + B
Declare uma matriz D. A matriz D deve ser a transposta de C (troca de linhas por colunas)
Mostrar a matriz D
Calcule e mostre o somatorio dos elementos da diagonal principal da matriz D
Gerar a matriz E que será o produto da multiplicação das matriz A e B

*/

import javax.swing.JOptionPane;

public class TwoDimensionalArrayExample {
	static String input;
	static int matricesLines = 3;
	static int matricesColumns = 3;
	
	public static void main(String[] args) {
		int matrixA[][] = new int[matricesLines][matricesColumns];
		int matrixB[][] = new int[matricesLines][matricesColumns];
		int matrixC[][] = new int[matricesLines][matricesColumns];
		int matrixD[][] = new int[matricesLines][matricesColumns];
		int matrixE[][] = new int[matricesLines][matricesColumns];
		
		int sumOfMainDiagonalD;
	
		getMatrixInput(matrixA, "A");
	     
	    System.out.println("\n \t  VEJA A MATRIZ A");
	    printMatrix(matrixA);
	    
		getMatrixInput(matrixB, "B");
		    
	    System.out.println("\n  \t  VEJA A MATRIZ B");
	    printMatrix(matrixB);
	    
	    matrixC = getMatricesSum(matrixA, matrixB);
	    System.out.println("\n \t  VEJA A MATRIZ C");
	    printMatrix(matrixC);
	    
	    matrixD = getMatrixTranspose(matrixC);
	    System.out.println("\n \t  VEJA A MATRIZ D");
	    printMatrix(matrixD);
	    
	    sumOfMainDiagonalD = getSumOfMainDiagonal(matrixD);
	    System.out.println("\n  SOMA DA DIAGONAL PRINCIPAL DA MATRIZ D: " + sumOfMainDiagonalD);
	    
	    matrixE = getMatricesMultiplication(matrixA, matrixB);
	    System.out.println("\n \t  VEJA A MATRIZ E");
	    printMatrix(matrixE);

	}
	
	
	private static int[][] getMatricesSum(int[][] firstMatrix, int[][] secondMatrix) {
		int matricesSum[][] = new int[matricesLines][matricesColumns];;
		for (int i = 0; i < matricesLines; i++) {
			for (int j = 0; j < matricesColumns; j++) {
				matricesSum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; 
			}
		}
		return matricesSum;
	}
	
	
	private static void printMatrix(int[][] matrix) {
	     for (int i=0; i < matricesLines; i++){
	    	 for (int j=0; j < matricesColumns; j++) {
		    	   System.out.print("\t"+matrix[i][j]); 
	    	 }
	      }
    	 System.out.println(); 
	}
	
	private static int[][] getMatrixInput(int[][] matrix, String str) {
	    for (int i=0; i < matricesLines; i++){
	    	for (int j=0; j < matricesColumns; j++){
	    		input = JOptionPane.showInputDialog("INFORME ELEMENTO " +(i+1) + (j+1)+" DA MATRIZ " + str + ".");
	    	    matrix[i][j] = Integer.parseInt(input); 
	    	   }
	       }
	    return matrix;
	}
	
	private static int[][] getMatrixTranspose(int[][] matrix) {
		int[][] transposedMatrix = new int[matricesLines][matricesColumns];
		
		for (int i = 0; i < matricesLines; i++) {
			for (int j = 0; j < matricesColumns; j++) {
				transposedMatrix[i][j] = matrix[j][i];
			}
		}
		return transposedMatrix;
	}
	
	private static int getSumOfMainDiagonal(int[][] matrix) {
		int sum = 0;
		
		for (int i = 0; i < matricesLines; i++) {
			for (int j = 0; j < matricesColumns; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}	
		}
		return sum;
	}
	
	private static int[][] getMatricesMultiplication(int[][] matrix1, int[][] matrix2) {
		int[][] multipliedMatrix = new int[matricesLines][matricesColumns];

		
		for (int i = 0; i < matricesLines; i++) {
			for (int j = 0; j < matricesColumns; j++) {
				int sum = 0;
				for (int k = 0; k < matricesLines; k++) {
					sum += (matrix1[i][k] * matrix2[k][j]);
				}
				multipliedMatrix[i][j] = sum;
			}
		}
		return multipliedMatrix;
	}
}
