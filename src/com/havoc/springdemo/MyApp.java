package com.havoc.springdemo;

public class MyApp {

	public static void main(String[] args) {
			
		// Create an object
		Coach theCoach = new BaseballCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach = new CricketCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
