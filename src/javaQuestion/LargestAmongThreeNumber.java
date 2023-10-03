package javaQuestion;
//9 java program to find largest among three number 
public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		int x=1700;
		int y=1700;
		int z=1000;
		if (x>y && x>z) {
			System.out.println("x is the greatest");
		}
		else if (x>z) {
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
		
		if (x>=y) {
			if(y>=z) {
				System.out.println("x is the greates");
				
			}
			else {
				System.out.println("z is the greatest");
			}
		}
			else {
				if(y>=z) {
				System.out.println("y is the greatest");
			}
				else {
					System.out.println("z is the greatest");
				}
		}
	

	}

}
