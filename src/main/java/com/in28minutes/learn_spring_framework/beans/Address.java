package com.in28minutes.learn_spring_framework.beans;

import java.util.Objects;

public class Address {
	private String firstLine;
	private String city;
	
	public Address(String firstLine, String city) {
		this.firstLine = firstLine;
		this.city = city;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.city, this.firstLine);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		Address other = (Address) obj;
		return this.firstLine == other.firstLine && this.city == other.city;
	}
	
	@Override
	public String toString() {
		return String.format("(firstLine: %s, city: %s)", 
				this.getFirstLine(), this.getCity());
	}
}
