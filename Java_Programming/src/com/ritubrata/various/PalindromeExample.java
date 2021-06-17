package com.ritubrata.various;

public class PalindromeExample {

	public static void findPalindromeNumber(int number) {
		int r,sum=0,temp;
		temp=number;
		while(number>0){
			r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome");
		}

	}
	public static void main(final String args[]){
		findPalindromeNumber(45454);
		findPalindromeNumber(123);
	}

}
