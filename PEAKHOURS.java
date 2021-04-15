package com.chain;

import java.time.LocalTime;

public class PEAKHOURS {
	public static void Time(LocalTime timeConversion,float Total,float killometres) {
		int peak= timeConversion.getHour();
		System.out.println("hour :" +peak); //value is print in peak amount 
		if(peak >+ 17 && peak <=19) {
			System.out.println("This is a peak hours :\n so you can pay in extra amount :");
			  // peak hours only extra amount will pay//
			float price= (float)((1.25/100)*killometres);//type casting method in this program//
			float AMOUNT=price+Total;
			System.out.println("your peakhours amount is : "+price); 
			    //print extra amount because peakhours it must be added//
			System.out.println("your overall amount is :" +AMOUNT);
			    //added through the overll amount//
			
			senior.citizen(AMOUNT);  //call the next function
			
			}
		else 
			senior.citizen(Total);
		}
	}

