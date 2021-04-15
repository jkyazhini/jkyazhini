package com.chain;
import java.util.Scanner;

public class BillEstimator {
	public static void CarType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cartype :"); // enter the cartype in the above details
		int cartype = sc.nextInt();
		System.out.println("Enter the killometres :"); // enter the killometres in user friendly
		float killometres = sc.nextFloat();
		if (cartype == 1) {
			micro(killometres);
		} // if firsttype of car in calculate to the calling function
		else if (cartype == 2) {
			mini(killometres);
		} // if second type of car in calculate to the another function
		else if (cartype == 3) {
			prime(killometres);
		} // if the third type of car due to calling function
		else {
			System.out.println("please enter the valid cartype in above details :");
		}
		// only enter valid cartype because program will be execute in in buil car type
		// only
	}

	public static void micro(float A) { /// declare to the micro cartype
		float amount = A * 10; // calculate the km in given cartype
		System.out.println("Total amount of MICRO = " + amount); /// print the price amount will be there in the screen

		GST.calc(amount,A); // (command) calculate the gst amount in the next class
	}

	public static void mini(float B) { /// declare to the mini cartype
		float amount = B * 15; // calculate the km in given cartype
		System.out.println("Total amount of MINI = " + amount); // print the price amount will be there in the screen

		GST.calc(amount,B); // it can be used in calculate the gst amount in the next class
	}

	public static void prime(float C) { // declare to the prime cartype
		float amount = C * 20; // calculate the km in given cartype
		System.out.println("Total amount of PRIME = " + amount); // print the price amount wil be there in the screen

		GST.calc(amount,C); // it can be used in calculate the gst amount in the next class
	}

}
