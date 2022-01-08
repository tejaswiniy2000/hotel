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

public class CustomerDAO {
     
	Connection con = ConnectionUtil.getConnection();
	Customers c= new Customers();
	Bookings b= new Bookings();
	
	public String registrationProcess(Customers c) {
		String sql1="insert into customers values(?,?,?,?,?)";
		try {
			PreparedStatement pst1=con.prepareStatement(sql1);
			pst1.setInt(1, c.getCusId());
			pst1.setString(2,c.getCname());
			pst1.setString(3,c.getPhoneNum());
			pst1.setString(4,c.getEmail());
			pst1.setString(5,c.getCpassword());
			System.out.println(pst1.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Success";
		
	}
	public List<Rooms> displayRooms() {
		List<Rooms>rooms=new ArrayList<Rooms>();		
		String sql2="select roomid,roomType,tv,wifi,specialFeatures,roomPrice,roomStatus from rooms";
		try {
			PreparedStatement pst2=con.prepareStatement(sql2);
			ResultSet rs=pst2.executeQuery();
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
	public String updateCustomerDetails(String cname, String phoneNum, String email, String cpassword, int Id) {
		String sql3="update customers set cname=?,phoneNum=?,email=?,cpassword=? where cusId=?";
		
		try {
			PreparedStatement pst3=con.prepareStatement(sql3);
			pst3.setString(1,c.getCname());
			pst3.setString(2,c.getPhoneNum());
			pst3.setString(3,c.getEmail());
			pst3.setString(4, c.getCpassword());
			pst3.setInt(5,c.getCusId());
			System.out.println(pst3.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
	}
	public String deleteCustomerDetails(int cusId) {
		String sql4="delete from customers  where cusid=?";
        try{
        	PreparedStatement pst4=con.prepareStatement(sql4);
			pst4.setInt(1,cusId);
			System.out.println(pst4.executeUpdate());
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return "success";
		
	}
	
	public int logInProcess(String name, String password) {
		int login=0;
		String Sql=" select count(*) from customers where cname=? and cpassword=?";
		
		try {
			PreparedStatement pst5=con.prepareStatement(Sql);
			pst5.setString(1,name);
			pst5.setString(2, password);
			ResultSet rs=pst5.executeQuery();
			rs.next();
			login=rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	   return login;
	}
	   public String bookRoom(Bookings b) {
		String sql6="insert into Bookings values(?,?,?,?,?)";
//		Bookings b1= new Bookings();
		try {
			PreparedStatement pst6=con.prepareStatement(sql6);
			pst6.setString(1,b.getCusId());
			pst6.setString(2,b.getRoomId());
			pst6.setString(3,b.getCheckIn());
			pst6.setString(4,b.getCheckOut());
			pst6.setDouble(5,b.getTotalPrice());
			System.out.println(pst6.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
		
	}
}
