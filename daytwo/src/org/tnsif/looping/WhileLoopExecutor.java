// Program to demonstrate while loop
// this loop executed only when the condition is true, if condition is false this loop stop executing
package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(n >= i) {
			System.out.print(n + " ");
			n--;
		}

	}

}