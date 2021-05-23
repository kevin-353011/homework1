package org.java.demo;
import java.util.*;
public class bayi {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[][] num = new double[3][4];
		System.out.print("Enter a 3-by-4 matrix by row: \n");
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				num[i][j] = input.nextDouble();
		for(int i=0;i<4;i++)
			System.out.printf("Sum of the elements at column %d is %4.1f\n", i,sumColumn(num,i));
}

public static double sumColumn(double[][] m,int columnIndex){
		int rows = m.length;
		double sum = 0;
		for(int i=0;i<rows;i++)
			sum += m[i][columnIndex];
		return sum;
}

}
