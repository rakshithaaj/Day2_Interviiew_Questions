package Day2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	int number=5,i,f=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a  number");
	i=sc.nextInt();
	
	for(i=1;i<=number;i++) {
		f=f*i;
		
	}
	System.out.print("factorial of number"+f);
	

	}

}
