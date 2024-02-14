package task9;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark");
        int mark=sc.nextInt();
        
        if(mark==100) {
        	System.out.println("The grade is S");
        }else if(mark>=90 && mark<=99) {
        	System.out.println("The grade is A");
        }else if(mark>=80 && mark<=89) {
        	System.out.println("The grade is B");
        }else if(mark>=70 && mark<=79) {
        	System.out.println("The Grade is C");
        }else if(mark>=60 && mark<=69) {
        	System.out.println("The Grade is D");
        }else if(mark>=50 && mark<=59) {
        	System.out.println("The Grade is E");
        }else {
        	System.out.println("The Grade is F");
        }
	}

}
