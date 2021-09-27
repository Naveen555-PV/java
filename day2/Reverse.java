package day2;

public class Reverse {
	public static void main(String[] args) {
		int num = 1234, reverse = 0;
         while(num != 0) {
	     int digit = num % 10;
	     reverse = reverse * 10 + digit;
	     num /= 10;
	    }

	    System.out.println("Reverse Number: " + reverse);
	  }
	}


