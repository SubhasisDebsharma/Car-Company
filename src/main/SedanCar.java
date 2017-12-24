package main;

public class SedanCar extends Car{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public float INIT_BASE_FARE;
	
	public SedanCar() {
		super.setType("Sedan");
	}
	
	public SedanCar(String regno, String driverName) {
		super.setRegno(regno);
		super.setDriverName(driverName);
		super.setType("Sedan");
		INIT_BASE_FARE = 50;
	}
	
	@Override
	float calculateFare(int kms) {
		int cost = 15;
		float fare = kms * cost + INIT_BASE_FARE;
		return fare;
	}
}
