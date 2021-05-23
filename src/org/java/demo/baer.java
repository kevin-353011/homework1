package org.java.demo;
import java.util.Scanner;
public class baer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] num = new double[4][4];
		System.out.print("Enter a 4-by-4 matrix row by row: \n");
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				num[i][j] = input.nextDouble();
		System.out.printf("Sum of the elements in the major diagonal is %.1f", sumMajorDiagonal(num));
}
public static double sumMajorDiagonal(double[][] m){
		int len = m.length;
		double sum =0;
		for(int i=0;i<len;i++)
			sum += m[i][i];
		return sum;
}

}
