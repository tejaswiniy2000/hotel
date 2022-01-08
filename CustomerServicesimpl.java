package com.cognizant.ems.sevices;

import java.util.List;

import com.cognizant.ems.beans.Bookings;
import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;
import com.cognizant.ems.dao.CustomerDAO;

public class CustomerServicesimpl implements ICustomer{
	
	CustomerDAO dao1=new CustomerDAO();

	@Override
	public String registrationProcess(Customers c) {
		// TODO Auto-generated method stub
		return dao1.registrationProcess(c);
	}

	@Override
	public List<Rooms> displayRooms() {
		// TODO Auto-generated method stub
		return dao1.displayRooms() ;
	}

	

	@Override
	public String deleteCustomerDetails(int cusId) {
		// TODO Auto-generated method stub
		return dao1.deleteCustomerDetails(cusId);
	}

	@Override
	public String updateCustomerDetails(String cname, String phoneNum, String email, String cpassword, int cusId) {
		// TODO Auto-generated method stub
		return dao1.updateCustomerDetails(cname, phoneNum, email, cpassword, cusId);
	}

	@Override
	public int logInProcess(String name, String password) {
		// TODO Auto-generated method stub
		return dao1.logInProcess(name, password);
	}

	@Override
	public String bookRoom(Bookings b) {
		// TODO Auto-generated method stub
		return dao1.bookRoom(b);
	}

	
		

	
	

}
