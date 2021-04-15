package com.chain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Booking{ 
	public static void OLACAB(float Total,float killometres) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the journey date [YYYY-MM-DD]  :"); //enter the correct valid date
		String date = sc.next();  //given input is string format
		LocalDate dateConversion = LocalDate.parse(date); //input is change to integer values
		LocalDate currentDate = LocalDate.now(); 
		if (dateConversion.isBefore(currentDate)) {
			System.out.println("Enter the valid date :"); //it will be accept in valid date only
		}
		if (dateConversion.isAfter(currentDate)) {
			Time(dateConversion,currentDate,Total,killometres);
		} else
			Time(dateConversion,currentDate,Total,killometres);
	}

	public static void Time(LocalDate A,LocalDate B,float Total,float killometres) { //convert to the variables form
			   Scanner sc = new Scanner(System.in);
			   System.out.println("please enter the cab pickup time [HH:MM:SS]  :"); //enter the correct pick up time and it will bw choose before timing
			   String time = sc.next();
			   LocalTime timeConversion = LocalTime.parse(time);
			   LocalTime currentTime = LocalTime.now();
			   
			   if (A==B) {
			   if(timeConversion.isBefore(currentTime)) {
						System.out.println("Enter the valid time :"); //use valid time only
					}
			         if (timeConversion.isAfter(currentTime)) { 
			        	 PEAKHOURS.Time(timeConversion,Total,killometres);
			         }
			         if (timeConversion==currentTime) {
			        	 
			        System.out.println("please wait a minutes  :"); //after enter the values waiting some time
			         }
			   }
			         PEAKHOURS.Time(timeConversion,Total,killometres); //next class command
			         }
	}
			   
	
			        
			        
			        
			        
			        
			        
			   
		 	


