package ru.mera.anisimova.postman;
import ru.mera.anisimova.postman.ImmutableEmail;
import ru.mera.anisimova.postman.ImmutableLetter;
import ru.mera.anisimova.postman.ImmutableMessage;
import ru.mera.anisimova.postman.ImmutablePerson;

import java.util.ArrayList;
import java.util.Scanner;


public class MailBox {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ImmutableLetter> empRecords = new ArrayList<ImmutableLetter>();
		ArrayList<ImmutableEmail> empRecords2 = new ArrayList<ImmutableEmail>();
		
		
		
		int count;
		do {
			System.out.println("Make your choice: 1 add just mail / 2 add email / 3 outpur just mail / 4 output email");
			int choice = scan.nextInt();
			switch(choice) {
			case(1):
				System.out.println("Enter your message");
				AddLetter(empRecords);
				break;
			case(2):
				System.out.println("Enter your message");
				AddEmail(empRecords2);
				break;
			case(3):
				for(ImmutableLetter emp : empRecords) {
		            System.out.println(emp);
		        }
				break;
			case(4):
				for(ImmutableEmail emp : empRecords2) {
		            System.out.println(emp);
		        }
				break;
			
			}
			System.out.println("Click 1 if you want to continue. Press 0 if you want to exit.");
			count = scan.nextInt();
		}while (count != 0);
		
	}
	
	public static void AddLetter (ArrayList emp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("To: ");
		String to =  scan.nextLine();
		System.out.println("Message body: ");
		String message_body = scan.nextLine();
		System.out.println("From postal index: ");
		String fromPostalIndex = scan.nextLine();
		System.out.println("To postal index: ");
		String toPostalIndex = scan.nextLine();
		System.out.println("From: ");
		String from = scan.nextLine();
		
		emp.add(new ImmutableLetter(to, message_body, fromPostalIndex, toPostalIndex, from));
		
		
		
	}
	
	public static void AddEmail (ArrayList emp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("From: ");
		String from =  scan.nextLine();
		System.out.println("To: ");
		String to =  scan.nextLine();
		System.out.println("Message body: ");
		String message_body =  scan.nextLine();
		System.out.println("Receive date: ");
	    String receive_date =  scan.nextLine();
	    
	    
	    emp.add(new ImmutableEmail(to, to, message_body, receive_date));
		
	}
}
