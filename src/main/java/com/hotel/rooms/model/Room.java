package com.hotel.rooms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="ROOMS")
public class Room {
   
	
	int number;
	
	String name;
	String acEnabled; //AC_ENABLED 
	int numberOfCots; //COTS_AVAILABLE 
	String tvAvailable; //TV_AVAILABLE 
	String sensorEnabled;//SENSOR_ENABLED 
	int roomTypeNum; //ROOM_TYPE_NO_FK 
     boolean isOccupied;
	
 	@Transient
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	@Id
	@Column(name="ROOM_NO")
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Column(name="ROOM_NAME")
	public String getName() {
		return name;
	}
	public void setName(String type) {
		this.name = type;
	}
	
	@Column(name="AC_ENABLED")
	public String getAcEnabled() {
		return acEnabled;
	}
	public void setAcEnabled(String acEnabled) {
		this.acEnabled = acEnabled;
	}
	@Column(name="NO_COTS_AVAILABLE")
	public int getNumberOfCots() {
		return numberOfCots;
	}
	public void setNumberOfCots(int numberOfCots) {
		this.numberOfCots = numberOfCots;
	}
	@Column(name="TV_AVAILABLE")
	public String getTvAvailable() {
		return tvAvailable;
	}
	public void setTvAvailable(String tvAvailable) {
		this.tvAvailable = tvAvailable;
	}
	@Column(name="SENSOR_ENABLED")
	public String getSensorEnabled() {
		return sensorEnabled;
	}
	public void setSensorEnabled(String sensorEnabled) {
		this.sensorEnabled = sensorEnabled;
	}
	@Column(name="ROOM_TYPE_NO_FK")
	public int getRoomTypeNum() {
		return roomTypeNum;
	}
	public void setRoomTypeNum(int roomTypeNum) {
		this.roomTypeNum = roomTypeNum;
	}
	
}
