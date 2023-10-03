package javaQuestion;
// 10 java program for check leap year
public class LeapYear {

	public static void main(String[] args) {
		//divisble by 4 for all the century year --ending with 00
		//century is leap  year inly when its perfectly divisble by 400
    //2012 leap year 
		int year =1900;
		boolean leap =false;
		if (year %4==0) {
			if(year % 100==0) {
				if(year % 400==0) {
					leap=true;
				}
				else {
					leap=true;
				}
				}
				else {
					leap=false;
				}
			}
		if(leap) {
			System.out.println(year + "is a leap year");
			
		}
		else {
			System.out.println(year + "is not a leap year");
		}
		}
		
		
	}


