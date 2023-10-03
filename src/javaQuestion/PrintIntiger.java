package javaQuestion;
//1 java program to print an  integer(enter by user)
import java.util.Scanner;

public class PrintIntiger {

	public static void main(String[] args) {
		Scanner reader =new  Scanner(System.in);
		System.out.println("Plz enter a number");
        int num= reader.nextInt();
        System.out.println("you entered:"+num);
	}

}
