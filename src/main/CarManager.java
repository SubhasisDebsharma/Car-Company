package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class CarManager {
	
	private HashMap<String, Car> cars = new HashMap<String, Car>();
	
	public static void main(String[] args) throws CarNotFoundException{
		CarManager manager = new CarManager();
		
		//Car c1 = new SmallCar("tn-03-ub-1234","Ramesh");	// present in the file
		Car c2 = new SmallCar("tn-04-ub-1234","aaditya");	// present in the file
		//Car c3 = new SedanCar("tn-05-ub-1234","bala");	// present in the file
		//Car c4 = new SedanCar("tn-08-ub-1234","Ram");		// present in the file
		
		Car c5 = new SedanCar("tn-09-ub-1234","Ratan");
		
		File file = new File("car_db.txt");
		
		manager.loadCarData(file);
		//manager.addCar(c2); // return false if car already loaded from file to the HashMap object
		manager.addCar(c5); // if not added should give exception while finding c5
		System.out.println(manager.findCar(c2));
		System.out.println(c2.calculateFare(10));
		System.out.println(manager.findCar(c5));//should give exception if c5 not added
		System.out.println(c5.calculateFare(10));	
	}
	
	boolean loadCarData(File file){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		if (file.exists()){
			try{
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				while(true){
					Car c = (Car)ois.readObject();
					if(!cars.containsKey(c.getRegno()))
						cars.put(c.getRegno(), c);
				}
			}
			catch(EOFException e){
				try {
					fis.close();
					ois.close();
					return true;
				} catch (IOException e1) {return false;}
			}
			catch(Exception e){
				return false;
			}
		}
		return false;
	}
	
	
	boolean addCar(Car car){
		if(!cars.containsKey(car.getRegno())){
			cars.put(car.getRegno(), car);
			return true;
		}
		return false;
	}
	
	Car findCar(Car car) throws CarNotFoundException{
		if(cars.containsKey(car.getRegno())) return car;
		throw new CarNotFoundException("Car not Found");
	}

}