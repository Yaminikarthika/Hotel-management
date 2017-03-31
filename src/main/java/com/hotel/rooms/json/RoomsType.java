package com.hotel.rooms.json;

public class RoomsType {
	int roomTypeNO;
	String roomType;
	int occupiedcount;
	int vacancyCount;
	public int getRoomTypeNO() {
		return roomTypeNO;
	}
	public void setRoomTypeNO(int roomTypeNO) {
		this.roomTypeNO = roomTypeNO;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getOccupiedcount() {
		return occupiedcount;
	}
	public void setOccupiedcount(int occupiedcount) {
		this.occupiedcount = occupiedcount;
	}
	public int getVacancyCount() {
		return vacancyCount;
	}
	public void setVacancyCount(int vacancyCount) {
		this.vacancyCount = vacancyCount;
	}
}
