package Guvi_Java_Task2;
import java.util.Scanner;
public class Number_Pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int n = input.length();
        int num = 1; 
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= i; j++) {
        		System.out.print(num + " ");
        		 num++;
        	}
        	System.out.println();
        	 
        }
        scanner.close();
        
	

	}

}
