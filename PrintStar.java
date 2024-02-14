package task9;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
	
			int i, j, num;

			Scanner sc = new Scanner(System.in);
           System.out.println("Enter a value for num");
           num = sc.nextInt(); 
           
			for (i = num; i >= 1; i--) {
           
				for (j = i; j < num; j++) {

			System.out.print(" ");
       }

			for (j = 1; j <= (2 * i - 1); j++) {

			    if (j == 1 || j == (2 * i - 1)) {

			System.out.print("*");

			    }else {

			System.out.print(" ");

			    }
			    }

			System.out.println("");

			}


			for (i = 2; i <= num; i++) {

			for (j = i; j < num; j++) {

			System.out.print(" ");

			}

			for (j = 1; j <= (2 * i - 1); j++) {

		    	if (j == 1 || j == (2 * i - 1)) {

			System.out.print("*");

		    	}else {

			System.out.print(" ");
		    	}
			}

			System.out.println("");

			}

			}

	}


