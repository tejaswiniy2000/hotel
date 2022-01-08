package com.cognizant.ems.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.ems.beans.Bookings;
import com.cognizant.ems.beans.Customers;
import com.cognizant.ems.beans.Rooms;
import com.cognizant.util.ConnectionUtil;

public class EmployeeDAO {
	
	Connection con = ConnectionUtil.getConnection();

	public String addRooms(Rooms r) {
		 String sql1="insert into rooms values(?,?,?,?,?,?,?)";
	        try {
	        	
     			PreparedStatement pst1=con.prepareStatement(sql1);
				pst1.setInt(1,r.getRoomId());
				pst1.setLong(2,r.getRoomPrice());
			    pst1.setString(3,r.getRoomType());
			    pst1.setString(4,r.getTv());
			    pst1.setString(5,r.getWifi());
			    pst1.setString(6,r.getSpecialFeatures()); 
			    pst1.setString(7,r.getRoomStatus());        	
				System.out.println(pst1.executeUpdate());
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return "success";
		
	}

	public String deleteRooms(int roomId1) {
		String sql3="delete from rooms  where roomid=?";
        try{
        	PreparedStatement pst3=con.prepareStatement(sql3);
			pst3.setInt(1,roomId1);
			System.out.println(pst3.executeUpdate());
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return "success";
	}
	public String updateRooms(String roomType, String tv, String wifi, long roomPrice, String specialFeatures,
			String roomStatus, int roomId) {
		    String sql2="update rooms set roomtype=?,tv=?,wifi=?,roomprice=?,specialFeatures=?,roomStatus=? where roomId=?";
			try {
				PreparedStatement pst2=con.prepareStatement(sql2);
				pst2.setString(1,roomType);
				pst2.setString(2,tv);
				pst2.setString(3,wifi);
				pst2.setLong(4,roomPrice);
				pst2.setString(5,specialFeatures );
				pst2.setString(6, roomStatus);
				pst2.setInt(7, roomId);
				System.out.println(pst2.executeUpdate());
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    
				return "Success";
		
	}
	
	
	public List<Rooms> showRooms() {
		
		List<Rooms>rooms=new ArrayList<Rooms>();		
	    String sql4="select roomid,roomType,tv,wifi,specialFeatures,roomPrice,roomStatus from rooms";
		//String sql4="select * from rooms";
		try {
			PreparedStatement pst4=con.prepareStatement(sql4);
			ResultSet rs=pst4.executeQuery();
			while(rs.next()) {
				Rooms r=new Rooms();
				r.setRoomId(rs.getInt(1));
				r.setRoomType(rs.getString(2));
				r.setTv(rs.getString(3));
				r.setWifi(rs.getString(4));
				r.setSpecialFeatures(rs.getString(5));
				r.setRoomPrice(rs.getLong(6));
				r.setRoomStatus(rs.getString(7));
				rooms.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rooms;
		
	}
	public List<Customers> showCustomers() {
		List<Customers>cus=new ArrayList<Customers>();
		String sql5="select cname,phoneNum,email,cpassword from customers";
		PreparedStatement pst5;
		try {
			pst5 = con.prepareStatement(sql5);
			ResultSet rs=pst5.executeQuery();
			while(rs.next()) {
				Customers c= new Customers();
				c.setCname(rs.getString(1));
				c.setPhoneNum(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setCpassword(rs.getString(4));
				cus.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cus;
		
	}
	public List<Bookings> displayBookings() {
		List<Bookings>bookings=new ArrayList<Bookings>();
		String sql6="select * from Bookings";
		PreparedStatement pst6;
		try {
			pst6 = con.prepareStatement(sql6);
			ResultSet rs=pst6.executeQuery();
			while(rs.next()){
				Bookings b= new Bookings();
				b.setCusId(rs.getString(1));
				b.setRoomId(rs.getString(2));
				b.setCheckIn(rs.getString(3));
				b.setCheckOut(rs.getString(4));
				b.setTotalPrice(rs.getDouble(5));
				bookings.add(b);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookings;
		
	}
}
