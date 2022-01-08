package com.cognizant.ems.beans;

public class Rooms {
	private int roomId;
	private long roomPrice;
	private String roomType;
	private String tv;
	private String wifi;
	private String specialFeatures;
	private String roomStatus;
	
	
	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public long getRoomPrice() {
		return roomPrice;
	}


	public void setRoomPrice(long roomPrice) {
		this.roomPrice = roomPrice;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public String getTv() {
		return tv;
	}


	public void setTv(String tv) {
		this.tv = tv;
	}


	public String getWifi() {
		return wifi;
	}


	public void setWifi(String wifi) {
		this.wifi = wifi;
	}


	public String getSpecialFeatures() {
		return specialFeatures;
	}


	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}


	public String getRoomStatus() {
		return roomStatus;
	}


	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}


	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomPrice=" + roomPrice + ", roomType=" + roomType + ", tv=" + tv
				+ ", wifi=" + wifi + ", specialFeatures=" + specialFeatures + ", roomStatus=" + roomStatus + "]";
	}
	
}








