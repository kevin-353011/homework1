package org.java.demo;
import java.util.Scanner;
public class bayisan {
	public static void main(String[] args) {
	    System.out.print("Enter the number of rows and columns of the array: ");
	    Scanner input = new Scanner(System.in);
	    int r, c;
	    r = input.nextInt();
	    c = input.nextInt();
	    double[][] a = new double[r][c];
	    System.out.print("Enter the array: \n");

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            a[i][j] = input.nextDouble();
	        }
	    }

	    int[] p = new int[2];
	    p = locateLargest(a);
	    System.out.print("The location of the largest element is at (" + p[0] + "," + p[1] + ")");
	}
	private static int[] locateLargest(double[][] a) {
	    int tmpArry[]=new int[2];
	    double tmp = 0;
	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            if(tmp<a[i][j]){
	                tmp=a[i][j];
	                tmpArry[0]=i;
	                tmpArry[1]=j;
	            }
	        }
	    }
	    return tmpArry;
	}

}
