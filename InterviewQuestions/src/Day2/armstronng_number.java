package Day2;

import java.util.Scanner;

public class armstronng_number {

	public static void main(String[] args) {
		int sum=0;
		int num;
		int r,t;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a  number");
		num=sc.nextInt();
		t=num;
		while(num>0) {
			r=num%10;
			sum+=r*r*r;
			num=num/10;

	}
		if(num==t) {
		System.out.println("number is armstrong");
	}
	}
}



