package org.tnsif.acc.c2tc.MultipleInheritance;



class SmartPhone implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {
		System.out.println("Playing a music in a smartphone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo using smartphone");
		
	}
	
}

public class MultipleInterface 
{

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();
	}

}