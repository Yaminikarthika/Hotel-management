package com.hotel.rooms.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOMS_AUDIT_HISTORY")
public class RoomAuditHistory {
 int id;
 int roomNoFk;
 String accessCardNo;
 Date loggedInDate;
 Date loggedOutDate;
 Timestamp loggedInTime;
 Timestamp loggedOutTime;
 
 @Id
 @Column(name="AUDIT_NO")
public int getId() {
	return id;
}
 
public void setId(int id) {
	this.id = id;
}

@Column(name="ROOM_NO_FK")
public int getRoomNoFk() {
	return roomNoFk;
}

public void setRoomNoFk(int roomNoFk) {
	this.roomNoFk = roomNoFk;
}

@Column(name="ACCESS_CARD_NO")
public String getAccessCardNo() {
	return accessCardNo;
}

public void setAccessCardNo(String accessCardNo) {
	this.accessCardNo = accessCardNo;
}

@Column(name="LOGGED_IN_DATE")
public Date getLoggedInDate() {
	return loggedInDate;
}

public void setLoggedInDate(Date loggedInDate) {
	this.loggedInDate = loggedInDate;
}

@Column(name="LOGGED_OUT_DATE")
public Date getLoggedOutDate() {
	return loggedOutDate;
}

public void setLoggedOutDate(Date loggedOutDate) {
	this.loggedOutDate = loggedOutDate;
}

@Column(name="LOGGED_IN_TIME")
public Timestamp getLoggedInTime() {
	return loggedInTime;
}

public void setLoggedInTime(Timestamp loggedInTime) {
	this.loggedInTime = loggedInTime;
}

@Column(name="LOGGED_OUT_TIME")
public Timestamp getLoggedOutTime() {
	return loggedOutTime;
}

public void setLoggedOutTime(Timestamp loggedOutTime) {
	this.loggedOutTime = loggedOutTime;
}
}
