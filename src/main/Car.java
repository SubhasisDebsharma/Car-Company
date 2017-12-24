package main;

import java.io.Serializable;

public abstract class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regno, type, driverName;
	
	abstract float calculateFare(int kms); 
	
	@Override
	public String toString() {
		return this.regno+" "+this.type+" "+this.driverName;
	}
	
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
