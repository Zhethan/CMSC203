import java.util.Scanner;
// 
//The purpose of this class is to model a television
//Your name and today’s date
//

public class Television{
	
	//Represents the manufacturer 
	private final String MANUFACTURER;
	//Represents the size of the screen
	private final int SCREEN_SIZE;
	//Represents whether power is on or not
	private boolean powerOn = false;
	//Represents the channel number
	private int channel =2;
	//Represents the volume level
	private int volume = 20;
	
	//The constructor is used to initialize the Television object
	public Television (String manufacturer, int screen_size) {
		MANUFACTURER = manufacturer;
		SCREEN_SIZE = screen_size;
	}
	//returns the volume
	public int getVolume() {
		return volume;
	}
	
	//returns the channel
	public int getChannel() {
		return channel;
	}
	
	//returns the manufacturer
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//returns the screen size
	public int getScreenSize() {
	return SCREEN_SIZE;
	}
	
	//Sets the channel to user input
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	//Turns power on if its off, and off if its on
	public void power() {
		if (powerOn == true){
			powerOn = !powerOn;
		}else {
			powerOn = true;
		}
	}
	//Increases volume
	public int increaseVolume() {
		volume +=1;
		return volume;
	}
	//Decreases volume
	public int decreaseVolume() {
		volume -=1;
		return volume;
	}
	
	
	
}
