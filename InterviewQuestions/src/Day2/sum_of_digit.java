package Day2;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		int sum=0;
		int num;
		int r;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a  number");
		num=sc.nextInt();
		while(num>0) {
			r=num%10;
			sum+=r;
			num=num/10;
			
			
		}
		System.out.println("sum of digits:" +sum);
		
		

	}

}
