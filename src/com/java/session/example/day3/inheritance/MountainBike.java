package com.java.session.example.day3.inheritance;

/**
 * 1. A subclass inherits all of the public and protected members of its parent, no matter what package the subclass is in
 * 
 * @author abhishek.sharma
 *
 */
public class MountainBike extends Bicycle {
	
	 // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
	
}
