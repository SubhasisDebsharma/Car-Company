# Car-Company

A gocar company needs to develop an application for their customers. 

## Classes:      

1.Car( Abstract class)    
2.SmallCar and SedanCar (extends abstract class Car)    
3.CarManager(concrete class)    
4.CarNotFound Exception class extends from java runtime exception    

   
// Small car fare = 10rs/km    
Sedan car fare = 15rs/km    
Fare is km * cost + base fare    
Base fare = 50 rs(INIT_BASE_FARE = 50)//    
      
      
### Car implements Serializable:    
Has (string regno,string type,string drivername)  Get all those values using getters and setters 
Abstract method calculateFare(int kms)      
      
### SmallCar:       
Private regno and driver name 
Type need to be small
calculateFare(int kms)

### SedanCar:    
Private reg no and driver name 
Type need to be Sedan 
calculateFare(int kms)

### CarManager:
Private member:    
	HashMap<string ,car> cars ;     
Method:    

boolean loadCarData(String file):   
Accepts the file and the file should have car information. Returns Boolean type and it must return false when no such file exist.     
File Contains these objects:    
“tn -03-ub -1234”,small,Ramesh     
“tn -04-ub -1234”,small,aaditya    
“tn -05-ub -1234”,sedan,bala    
“tn -08-ub -1234”,sedan,Ram    
This method must read and access the file information    
   
boolean addCar(Car)      
Add car to  cars(HashMap Object), use the key same as the registraion number of the car.Return false if car already exists else true.    
    
Car findCar(car) throws CarNotFoundExcepion:    
Returns details of car if not should give exception     

Main throws CarNotFoundExcepion:     
CarManager manager = new CarManager();    
```java
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
```

#
See code Here [src/main](https://github.com/SubhasisDebsharma/Car-Company/tree/master/src/main)    
    
Code: java8+   
IDE: Eclipse
