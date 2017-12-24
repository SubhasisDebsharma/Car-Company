package main;

public class CarNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarNotFoundException(String msg){
		super(msg);
	}
}
