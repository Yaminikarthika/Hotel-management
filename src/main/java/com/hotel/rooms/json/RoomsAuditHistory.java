package com.hotel.rooms.json;

import java.sql.Timestamp;
import java.util.Date;

public class RoomsAuditHistory {
	 int id;
	 int RoomNoFk;
	 String AccessCardNo;
	 Date LoggedInDate;
	 Date LoggedOutDate;
	 Timestamp LoggedInTime;
	 Timestamp LoggedOutTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNoFk() {
		return RoomNoFk;
	}
	public void setRoomNoFk(int roomNoFk) {
		RoomNoFk = roomNoFk;
	}
	public String getAccessCardNo() {
		return AccessCardNo;
	}
	public void setAccessCardNo(String accessCardNo) {
		AccessCardNo = accessCardNo;
	}
	public Date getLoggedInDate() {
		return LoggedInDate;
	}
	public void setLoggedInDate(Date loggedInDate) {
		LoggedInDate = loggedInDate;
	}
	public Date getLoggedOutDate() {
		return LoggedOutDate;
	}
	public void setLoggedOutDate(Date loggedOutDate) {
		LoggedOutDate = loggedOutDate;
	}
	public Timestamp getLoggedInTime() {
		return LoggedInTime;
	}
	public void setLoggedInTime(Timestamp loggedInTime) {
		LoggedInTime = loggedInTime;
	}
	public Timestamp getLoggedOutTime() {
		return LoggedOutTime;
	}
	public void setLoggedOutTime(Timestamp loggedOutTime) {
		LoggedOutTime = loggedOutTime;
	}
}
