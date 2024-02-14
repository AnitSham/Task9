package task9;

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {

	 String Org;
	 String Rev="";
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
 Org = sc.nextLine();

 int length=Org.length();
 
for(int i=length-1 ; i>=0 ;i--) {
 Rev=Rev+Org.charAt(i);
}

//System.out.println(Rev);
if(Org.equals(Rev)) {
	System.out.println("The String is Palindrome");
}else {
	System.out.println("The String is not Palindrome");
}
}
}