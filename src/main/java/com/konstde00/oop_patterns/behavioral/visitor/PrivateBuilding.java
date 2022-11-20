package com.konstde00.oop_patterns.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrivateBuilding
		implements GeoElement {
	
	private double x;
	private double y;
	private String address;
	private int numberOfApartments;
	@Override
	public void accept(Visitor visitor) {
		visitor.doForPrivateBuilding(this);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfApartments() {
		return numberOfApartments;
	}

	public void setNumberOfApartments(int numberOfApartments) {
		this.numberOfApartments = numberOfApartments;
	}
}
