package javaQuestion;
//7 java program to check whether a number is  even or odd
import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("plz enter a number ");
		int num =reader.nextInt();
		if (num%2==0) {
			System.out.println(num+"is even");
		}
		else {
			System.out.println(num+"is odd");
		}

	}

}
