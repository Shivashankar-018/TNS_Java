package org.tnsif.acc.c2tc.MethodOverRiding_Super_this_instanceof;


class Notification 
{
	String message="Default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification from whatsapp";
	
	void showNotification()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
}

public class SuperWithVariable {

	public static void main(String[] args) {
		PushNotification obj=new PushNotification();
		obj.showNotification();
	}

}