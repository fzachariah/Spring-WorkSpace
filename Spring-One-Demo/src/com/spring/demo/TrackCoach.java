package com.spring.demo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it:  "+fortuneService.getFortune();
	}
	
	//add an init method
	
	public void doMyStartupStuff()
	{
		System.out.println("Inside init method");
	}
	
	public void doMyCleanupStuff()
	{
		System.out.println("Inside destroy method");
	}
	
	
	//add a destroy method

}
