package robot.controller;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;
import robot.model.EV3Bot;

public class RobotController
{
	private String message;
	private int xPosition;
	private int yPosition;
	
	private long waitTime;
	
	private EV3Bot tobinBot;
	
	public RobotController()
	{
		this.message = "Programming Lego robots with Java";
		this.xPosition = 10;
		this.yPosition = 10;
		this.waitTime = 4000;
	
		tobinBot = new EV3Bot();
	}	
	
	public void start()
	{
		LCD.drawString(message,  xPosition, yPosition);
		Delay.msDelay(waitTime);
		
		tobinBot.driveRoom();
	}
}
