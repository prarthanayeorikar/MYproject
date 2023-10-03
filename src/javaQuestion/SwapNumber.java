package javaQuestion;
//6 java program for swap number
public class SwapNumber {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("before swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("after swaping");
       int temp;
       temp=a;
       a=b;
       b=temp;
       System.out.println("a="+a);
       System.out.println("b="+b);
	}

}
