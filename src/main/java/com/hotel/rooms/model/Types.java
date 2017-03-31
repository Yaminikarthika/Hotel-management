package com.hotel.rooms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ROOM_TYPE")
public class Types {

	int number;
	String roomType;
	int occupiedCount;
	int vacancyCount;
	
	@Id
	@Column(name="ROOM_TYPE_NO")
	public int getNumber() {
		return number;
	}
	public void setNumber(int roomTypeNo) {
		this.number = roomTypeNo;
	}
	@Column(name="ROOM_TYPE_NAME")
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Transient
	public int getOccupiedcount() {
		return occupiedCount;
	}
	public void setOccupiedcount(int occupiedcount) {
		this.occupiedCount = occupiedcount;
	}
	@Transient
	public int getVacancyCount() {
		return vacancyCount;
	}
	public void setVacancyCount(int vacancyCount) {
		this.vacancyCount = vacancyCount;
	}
}
