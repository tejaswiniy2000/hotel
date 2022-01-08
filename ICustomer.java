package com.cognizant.ems.sevices;

import java.util.List;

import com.cognizant.ems.beans.Bookings;
import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;

public interface ICustomer {
	public String registrationProcess(Customers c);
	public int logInProcess(String name,String password);
	public List<Rooms> displayRooms();
	public String updateCustomerDetails(String cname,String phoneNum,String email,String cpassword,int cusId);
	public String deleteCustomerDetails(int cusId);
	public String bookRoom(Bookings b);
	
}
