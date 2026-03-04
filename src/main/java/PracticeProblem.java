/**
 * File: Converting Data Types
 * Author: Joe Yang
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */


import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer: ");
	int num = input.nextInt();
	num = (num + 3);
	System.out.println(num);
	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	String num1 = (input.nextLine() + "4");
	double num2 = Double.parseDouble(num1);
	System.out.println(num2 + 2);
	
	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a radius: ");
	Double num = input.nextDouble();
	Double pi =  (3.14);
	System.out.println(pi * (num*num)); 

	
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	Double num = input.nextDouble();
	num = (num*12);
	System.out.println(Math.floor(num));

	}

}
