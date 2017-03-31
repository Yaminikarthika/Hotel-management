package com.hotel.rooms.json;

import org.springframework.stereotype.Component;

@Component(value="roomJson")

public class Rooms {
	int id;
	String acEnabled; //AC_ENABLED 
	int numberOfCots; //COTS_AVAILABLE 
	String tvAvailable; //TV_AVAILABLE 
	String sensorEnabled;//SENSOR_ENABLED 
	int RoomTypeNum;
	boolean isOccupied;
	

	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public String getAcEnabled() {
		return acEnabled;
	}
	public void setAcEnabled(String acEnabled) {
		this.acEnabled = acEnabled;
	}
	public int getNumberOfCots() {
		return numberOfCots;
	}
	public void setNumberOfCots(int numberOfCots) {
		this.numberOfCots = numberOfCots;
	}
	public String getTvAvailable() {
		return tvAvailable;
	}
	public void setTvAvailable(String tvAvailable) {
		this.tvAvailable = tvAvailable;
	}
	public String getSensorEnabled() {
		return sensorEnabled;
	}
	public void setSensorEnabled(String sensorEnabled) {
		this.sensorEnabled = sensorEnabled;
	}
	public int getRoomTypeNum() {
		return RoomTypeNum;
	}
	public void setRoomTypeNum(int roomTypeNum) {
		RoomTypeNum = roomTypeNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	String type;
}
