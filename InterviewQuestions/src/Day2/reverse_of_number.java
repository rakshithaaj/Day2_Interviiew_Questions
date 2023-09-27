package Day2;

import java.util.Scanner;

public class reverse_of_number {

	public static void main(String[] args) {
		int r,rev=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a  number");
		num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
		System.out.println("rev of number:" +rev);

	}

}
