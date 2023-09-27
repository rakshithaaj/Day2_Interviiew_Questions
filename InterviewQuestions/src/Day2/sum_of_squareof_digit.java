package Day2;

import java.util.Scanner;

public class sum_of_squareof_digit {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a number");
		num=sc.nextInt();
		while(num>0) {
			r=num%10;
			sum+=r*r;
			num=num/10;
		}
		System.out.println("sum of  square of digits:" +sum);
		
		
		

	}

}
