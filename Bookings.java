package com.cognizant.ems.beans;

public class Bookings {
	
	    private String roomId;
	    private String cusId;
	    private String checkIn;
		private String checkOut;
		private double totalPrice;
		@Override
		public String toString() {
			return "Bookings [roomId=" + roomId + ", cusId=" + cusId + ", checkIn=" + checkIn + ", checkOut=" + checkOut
					+ ", totalPrice=" + totalPrice + "]";
		}
		public String getRoomId() {
			return roomId;
		}
		public void setRoomId(String roomId) {
			this.roomId = roomId;
		}
		public String getCusId() {
			return cusId;
		}
		public void setCusId(String cusId) {
			this.cusId = cusId;
		}
		public String getCheckIn() {
			return checkIn;
		}
		public void setCheckIn(String checkIn) {
			this.checkIn = checkIn;
		}
		public String getCheckOut() {
			return checkOut;
		}
		public void setCheckOut(String checkOut) {
			this.checkOut = checkOut;
		}
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		
		
	
}
