/**
 *You will be given two integers as input, you have to compute . 
 *If they are not bit signed integers or if is zero, exception will occur and 
 *you have to report it. 
 *Read sample Input/Output to know what to report in case of exceptions.  
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int input1 = scanner.nextInt();
			int input2 = scanner.nextInt();
			System.out.println(input1 / input2);
		}

		catch (Exception e) {
			System.out.println(e);
		}
		scanner.close();
	}

}
