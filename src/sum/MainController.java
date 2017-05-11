package sum;

import java.util.Scanner;
/*
 * Bijon Mathew
 * 6 May 2017
 */

public class MainController {

	public static void main(String args[]) {
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first Integer");
		a = in.nextInt();

		System.out.println("Enter second integer");
		b = in.nextInt();
		in.close();

		boolean result = IsOneOrSum.isOneOrSum(a, b);
		
		if(result == true){
			System.out.println("True");
			
		}else{
			System.out.println("False");
		}
	}
}
