package task9;

import java.util.Scanner;

public class ReverseString {

	static String Org;
	static String Rev="";
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	Org = sc.nextLine();

	int length=Org.length();

	for(int i=length-1 ; i>=0 ;i--) {
	Rev=Rev+Org.charAt(i);
	}
    
	System.out.println(Rev);
	
	}

}
