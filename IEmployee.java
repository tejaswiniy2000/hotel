package com.cognizant.ems.sevices;

import java.util.List;

import com.cognizant.ems.beans.Bookings;
import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;

public interface IEmployee {
	public String addRooms(Rooms r);
	public String deleteRooms(int roomId1);
	public String updateRooms( String roomType,String tv,String wifi, long roomPrice,String specialFeatures,String roomStatus,int roomId);
	public List<Rooms> showRooms();
	public List<Customers> showCustomers();
	public List<Bookings> displayBookings();
	
	
}
