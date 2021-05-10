/**
 *Handling a checked exception by opening a file 
*Write a  code opens a text file and 
*writes its content to the standard output. What happens if the file doesn’t exist? 
 */
package com.hcl;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment1 {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Pragati\\Desktop\\java.txt"));
			while (scanner.hasNext()) {
				String string = scanner.nextLine();
				System.out.println(string);
			}
			scanner.close();
		}
		// Catching the exception
		catch (FileNotFoundException fnfe) {
			// print the stack trace
			fnfe.printStackTrace();

		}

	}
}
