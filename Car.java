*
*
*
public class Car extends Vehicle{
	private int numDoors;
	private int numPassengers;
	
	public Car(String make, String model, String plate, int doors, int passengers){
		super(make, model, plate);
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.numPassengers;
	}
	
	public String toString(){
		String result = String.format("%d-door %s %s with license %s.", this.numDoors, this.getMake(), this.getModel(), this.getPlate())
		return result;
	}
	
	@Override 
	public boolean equals(Object obj){
		if(!(obj instanceof Vehicle)){
			return false;
		}
		
		Car other = (Car) obj;
		
		if (this.numDoors == other.getDoors()){
			if( this.numPassengers == other.getPassengers()){
				return super.equals(obj);
			}
		}
		return false;
	}
	
	public Car copy(){
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int numOfDoors = this.getDoors();
		int numOfPassengers = this.getPassengers();
		
		Car copy = new Car(theMake, theModel, thePlate, numOfDoors, numOfPassengers);
		return copy;
	}
}
	
	