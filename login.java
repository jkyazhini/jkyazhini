package com.chain;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {   // create a main function of the program
		Scanner sc = new Scanner(System.in);   // please enter your mobile numbers for login

		System.out.println("enter the mobile number: ");
		Long mobileNo = sc.nextLong();
		String mobileNoString = String.valueOf(mobileNo); // only ten numbers are accepted in this program
		if (mobileNoString.length() == 10) { // declare to the length of mobile no
			System.out.println("verified successfully"); // mobile number is is correct then move to next
		} else {
			System.out.println("verified unsuccessfully"); // if mobile number is wrong,enter the valid number
		}

		System.out.println("enter your password (eight char must) :"); // if can be use only eight characters
		String name = sc.next();
		String nameString = String.valueOf(name);
	
	if (name.length() == 8) { // declare to the length of password
			System.out.println("login successfully"); // only accept in eight character in this program
			CabType.ola(); // call the next class
		} else {
			System.out.println("login unsuccessfully"); // use more than eight characters is not succeed.
		}

	}
}
