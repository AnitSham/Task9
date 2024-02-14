package task9;

import java.util.Scanner;

public class LargestNum {

	int a,b,c;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
	     int a=sc.nextInt();
	     
	     Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the 2nd number: ");
		 int b=sc1.nextInt();
		
		   Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the 3rd number: ");
			 int c=sc2.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is the largest number");
		}else if(b>a && b>c) {
			System.out.println("b is the largest number");
		}else if(c>a && c>b) {
			System.out.println("c is the largest number");
		}else {
			System.out.println("Invalid");
		}
	}

}
