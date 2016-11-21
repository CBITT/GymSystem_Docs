import java.util.Random;

public class Rooms{
	
	
	Random r = new Random();
	String room;
	int capacity = 30;
	int currCapacity;

	int min = 0;
	int max = capacity;
	//int currCapacity = r.nextInt(max - min) + min;

public Rooms(String room, int capacity, int currCapacity){
	this.room = room;
	this.capacity = 30;
	this.currCapacity = currCapacity;
}

public Rooms(){
	setRoom(room);
	setCapacity(capacity);
	setCurrCapacity(currCapacity);
}

public String getRoom(){
    return room;
}

public int getCapacity(){
	return capacity;
}

public int getCurrCapacity(){
	return currCapacity;
}

public void setRoom(String room){
	this.room = room;
}

public void setCapacity(int capacity){
	this.capacity = capacity;
}

public void setCurrCapacity(int currCapacity){
	this.currCapacity = currCapacity;
}

public int setCurrCapacity(int currCapacity, int capacity){
	Random r = new Random();
	int min = 0;
	int max = capacity;
	this.currCapacity = r.nextInt(max - min) + min;
	return currCapacity;
}

public String toString(){
	return "Room Type: " + getRoom() + "\nCapacity: " + getCapacity() + "\nCurrent Capacity: " + getCurrCapacity(); 
}

}

