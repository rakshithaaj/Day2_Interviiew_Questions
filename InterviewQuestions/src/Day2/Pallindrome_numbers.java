package Day2;

import java.util.Scanner;

public class Pallindrome_numbers {

	public static void main(String[] args) {
		int number,r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a  number");
		number=sc.nextInt();
	
		while(number>0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;
			
			
		}
		if(number==rev) {
			System.out.print("number is pallindrome");
		}
		else {
			System.out.print("number is not a pallindrome");
		}
			
		}
		

	}


