package com.cognizant.ems.main;

import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;
import com.cognizant.ems.sevices.CustomerServicesimpl;
import com.cognizant.ems.sevices.EmployeeServiceImpl;
import com.cognizant.util.ConnectionUtil;
//import com.cognizant.util.NameValidation;
import com.cognizant.util.UsernameValidator;
import com.cognizant.util.Valid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cognizant.ems.beans.Bookings;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection con = ConnectionUtil.getConnection();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		Rooms r=new Rooms();
		Customers c= new Customers();
		Bookings b= new Bookings();
		Valid v=new Valid();
		UsernameValidator n=new UsernameValidator();
		EmployeeServiceImpl empservice=new EmployeeServiceImpl();
		
		CustomerServicesimpl customerService=new CustomerServicesimpl();
	
		int ch;
		
		do {
			System.out.println("-----WELCOME-----");
			System.out.println("Enter 1 for Employee.\nEnter 2 for Customer.\nEnter 0 to Exit.");
			 ch =s.nextInt();
			 switch(ch) {
			 case 1:System.out.println("--------WELCOME EMPLOYEE-------");
				System.out.println("Enter 1 to add  room\nEnter 2 to update rooms\n"
						+ "Enter 3 to delete room\nEnter 4 for show all rooms\n "
						+ "Enter 5 for display all customers\nenter 6 for  display all bookings\n"
						+ "Enter 7 for exit");
				int option=s.nextInt();
				switch(option) {
				case 1:
					System.out.println("enter your room id");
					r.setRoomId(s.nextInt());
			        System.out.println("enter your room price");
			        r.setRoomPrice(s.nextLong());
			        System.out.println("enter  your room type");
			        r.setRoomType(s.next());
			        System.out.println("enter yes or no for tv");
			        r.setTv(s.next());
			        System.out.println("enter yes or no for wifi");
			        r.setWifi(s.next());
			        System.out.println("enter special features ");
			        r.setSpecialFeatures(s.next());
			        System.out.println("enter your room status");
			        r.setRoomStatus(s.next());
			        empservice.addRooms(r);
			         				
					break;
				case 2:
					System.out.println("update rooms");
					System.out.println("enter the roomid");
					int roomId=s.nextInt();
					System.out.println("enter room type");
					String roomType=s.next();
					System.out.println("enter yes or no for tv");
					String tv=s.next();
					System.out.println("enter yes or no for wifi");
					String wifi=s.next();
					System.out.println("enter room price");
					long roomPrice=s.nextLong();
					System.out.println("enter special features");
				    String specialFeatures=s.next();
					System.out.println("enter room status");
					String rs=s.next();
				
					empservice.updateRooms(roomType, tv, wifi, roomPrice, specialFeatures, rs, roomId);
					break;
				case 3:
					System.out.println("delete rooms");
					System.out.println("enter the roomid");
					int roomId1=s.nextInt();
					empservice.deleteRooms(roomId1);
					break;
					
				case 4:
					System.out.println("displaying all rooms");
				    //System.out.println("RoomId"+" RoomType "+" tv  "+" wifi "+"  SpecialFeatures"+"   roomPrice"+"  RoomStatus"+" \n");
					System.out.println(empservice.showRooms());
					break;
					
				case 5:
					System.out.println("displaying all customers");
					System.out.println(empservice.showCustomers());
					break;
				case 6:
					System.out.println("displaying all bookings");
					System.out.println(empservice.displayBookings());
					break;
				case 8:
					System.out.println("Exit");
					break;
				default :
					System.out.println("Enter valid option");
				
				}
				
				break;
				
			 case 2:
				 System.out.println("WELCOME CUSTOMER");
				 
				System.out.println("Enter 1 for registration\n"
						+"Enter 2 to login\n"
						+"enter 3 Exit");
					int option2=s.nextInt();
					switch(option2) {
					case 1:
					System.out.println("Enter your customer id");
					c.setCusId(s.nextInt());
					String name1=null;
					do {
					System.out.println("Enter your  name");
					name1=s.next();
					}while(v.validName(name1)!=true);
			        c.setCname(name1);
			        System.out.println("Enter your phone number");
			        c.setPhoneNum(s.next());
			        System.out.println("Enter your email id");
			        c.setEmail(s.next());
			        String pass1=null;
			        do {
			        System.out.println("Enter password");
			        pass1=s.next();
			        }while(v.validPassword(pass1)!=true);
			        c.setCpassword(pass1);
			        System.out.println(customerService.registrationProcess(c));
						
			        break;
					case 2:
						System.out.println("enter your name");
						String name=s.next();
						System.out.println("enter your password");
						String password=s.next();
						System.out.println(customerService.logInProcess(name, password));
						
						System.out.println("enter 1 for display available rooms\n"
						           +"enter 2 to Update customer Details\n"
								   +"enter 3 to delete customer Details\n"
						           +"enter 4 for book a room"
								   + "enter 5  for Exit");
						int option3=s.nextInt();
						switch(option3) {
						case 1:
							System.out.println("displaying all rooms");
							System.out.println("------------------");
							System.out.println(customerService.displayRooms());
							break;
						case 2:
							System.out.println("update details");
							System.out.println("enter id");
							int cId=s.nextInt();
							System.out.println("enter customer name");
							String cname=s.next();
							System.out.println("enter email");
							String email=s.next();
							System.out.println("enter phone Number");
							String phoneNum=s.next();
							System.out.println("enter password");
							String cpassword=s.next();
					
							customerService.updateCustomerDetails(cname, phoneNum, email, cpassword, cId);
							break;
						case 3:
							System.out.println("enter id");
							int cusId=s.nextInt();
							customerService.deleteCustomerDetails(cusId);
							break;
						case 4:
								System.out.println("enter room id");
								b.setRoomId(s.next());
								System.out.println("enter customer id");
								b.setCusId(s.next());
								System.out.println("enter checkin date");
								b.setCheckIn(s.next());
								System.out.println("enter checkout date");
								b.setCheckOut(s.next());
								System.out.println("enter total price");
							    b.setTotalPrice(s.nextDouble());
							    System.out.println(b.getCheckOut());
							    System.out.println(customerService.bookRoom(b));
								
							break;
						case 5:
							System.out.println("exit");
							
						}
						
					}
				
			 }
		
		}while(ch!=0);
	
	}

}
