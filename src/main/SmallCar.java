package main;

public class SmallCar extends Car{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public float INIT_BASE_FARE;
	
	public SmallCar() {
		super.setType("Small");
	}
	
	public SmallCar(String regno, String driverName) {
		super.setRegno(regno);
		super.setDriverName(driverName);
		super.setType("Small");
		INIT_BASE_FARE = 50;
	}
	
	@Override
	float calculateFare(int kms) {
		int cost = 10;
		float fare = kms * cost + INIT_BASE_FARE;
		return fare;
	}
}
