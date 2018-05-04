package com.Eugine.HibDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int HouseNum;
	private String Street;
	
	public int getHouseNum() {
		return HouseNum;
	}
	public void setHouseNum(int houseNum) {
		HouseNum = houseNum;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [HouseNum=" + HouseNum + ", Street=" + Street + "]";
	}
	
}
