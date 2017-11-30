
public class VariablesAndNames 
{
	public static void main(String[] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		cars = 100; //number of cars
		space_in_a_car = 4; //number of people that can fit in each car
		drivers = 30; //number of drivers
		passengers = 90; //number of passengers
		cars_not_driven = cars - drivers; //the cars that are not driven
		cars_driven = drivers; //each driver drives one car
		carpool_capacity = cars_driven * space_in_a_car; //total number of passengers that can be taken
		average_passengers_per_car = passengers/cars_driven; //number of people per car
		
		System.out.println("There are " + cars + " cars available.");
		System.out.println("There are only " + drivers + " drivers available.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
	}

}
