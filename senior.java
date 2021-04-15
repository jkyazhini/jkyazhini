package com.chain;

import java.time.LocalDate;
import java.util.Scanner;

public class senior {
	public static void citizen(float AMOUNT) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your DOB :"); //enter the date of birth
		String DOB= sc.next();
		LocalDate DOBString=LocalDate.parse(DOB);  //convert to the dob
		LocalDate currentDate=LocalDate.now();
		int type1 = DOBString.getYear(); 
		int type2 = currentDate.getYear(); 
		int age = (type1-type2); //subraction of old year to current year
		if (age>60) {
			float type3=(AMOUNT/100)*50;
		System.out.println("you are the SENIOR CITIZEN so your bill amount is :" +type3);
		    //type 3 is succeed then you are a senior citizen
		}
		else 
			System.out.println("you are not a SENIOR CITIZEN so your bill amount is :" +AMOUNT);
		    //AMOUNT is succeed then you are not a senior citizen
		}

	
	}
	


