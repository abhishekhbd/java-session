package com.java.session.example.day3.inheritance;

public class Bicycle {
	
	// the Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
    	this.cadence = newValue;
    }
        
    public void setGear(int newValue) {
    	this.gear = newValue;
    }
        
    public void applyBrake(int decrement) {
    	this.speed -= decrement;
    }
        
    public void speedUp(int increment) {
    	this.speed += increment;
    }
	
}
