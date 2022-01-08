package com.cognizant.ems.sevices;

import java.util.List;

import com.cognizant.ems.beans.Bookings;
import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;
import com.cognizant.ems.dao.EmployeeDAO;

public class EmployeeServiceImpl implements IEmployee{
	
	EmployeeDAO dao=new  EmployeeDAO();

	@Override
	public String addRooms(Rooms r) {
		// TODO Auto-generated method stub
		return dao.addRooms(r);
	}

	@Override
	public String deleteRooms(int roomId1) {
		// TODO Auto-generated method stub
		return dao.deleteRooms(roomId1);
	}

		@Override
	public String updateRooms(String roomType, String tv, String wifi, long roomPrice, String specialFeatures,
			String roomStatus, int roomId) {
		// TODO Auto-generated method stub
		return dao.updateRooms(roomType, tv, wifi, roomPrice, specialFeatures, roomStatus, roomId);
	}

		@Override
	public List<Rooms> showRooms() {
		// TODO Auto-generated method stub
		return dao.showRooms();
	}

	@Override
	public List<Customers> showCustomers() {
		// TODO Auto-generated method stub
		return dao.showCustomers();
	}

	@Override
	public List<Bookings> displayBookings() {
		// TODO Auto-generated method stub
		return dao.displayBookings();
	}

	

	
	

	
	
}
