package Guvi_Java_Task2;

import java.util.Scanner;

public class Reverse_a_string {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	     String input = scanner.nextLine();
	     String reversed = "";
	     for (int i = input.length() - 1; i >= 0; i--) {
	            reversed = reversed + input.charAt(i);
	     }
	     System.out.println("Reversed string: " + reversed);

	        scanner.close();

	        

		 

	}

}
