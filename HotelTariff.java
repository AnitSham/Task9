package task9;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		
		int month;
		float rent;
		int num;
		double r=0;
		float tariff=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		month=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the rent amount");
		rent=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the num of days");
		num=sc2.nextInt();
		
		tariff=rent*num;
		r=((rent+(rent*0.2))*num);
		
		switch(month)
		{
		case 1:
		  Amount(tariff);
		  break;
		case 2:
			  Amount(tariff);
			  break;
		case 3:
			  Amount(tariff);
			  break;
		case 4:
			  Amount(r);
			  break;
		case 5:
			  Amount(r);
			  break;
		case 6:
			  Amount(r);
			  break;
		case 7:
			  Amount(tariff);
			  break;
		case 8:
			  Amount(tariff);
			  break;
		case 9:
			  Amount(tariff);
			  break;
		case 10:
			  Amount(tariff);
			  break;
		case 11:
			  Amount(r);
			  break;
		case 12:
			  Amount(r);
			  break;
		}
	}

	private static void Amount(double r) {
		
		System.out.println("Hotel Rent for particular months increased by 2%"  +"  " + r);
	}

	private static void Amount(float tariff2) {
		
		System.out.println("Hotel Rent usual for every months"  +"  " +tariff2);
		
	}
}
