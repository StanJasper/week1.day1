package week1.day1;			//- Create package name as week1.day1

public class Mobile 		//- Create a  new class as "Mobile" under week1.day1

{
	String Mobilemodel = "Oneplus 9Pro";
	int Mobileweight = 197;
	boolean Mobileisfullcharge = true;
	double Mobileprice = 60000.123;
	
	
	public void makecall() 	//-Create method (makeCall()) with simple print statement
	{
		System.out.println("Call Connected");
	}
	
	public void sendmessage() //-Create method (sendMsg()) with simple print statement
	{
		System.out.println("message sent");
	}
	
	public static void main(String[]args)	//- Create main method
	{
		Mobile mob = new Mobile();			//- Create object for Mobile class
		
		mob.makecall();						//-call the methods using the object
		mob.sendmessage();
		
		System.out.println(mob.Mobilemodel);
		System.out.println(mob.Mobileweight);
		System.out.println(mob.Mobileisfullcharge);
		System.out.println(mob.Mobileprice);
	}
}
