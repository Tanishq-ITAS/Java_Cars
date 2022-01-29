
import java.util.Scanner;

public abstract class Vehicle {

	protected static String model;
	protected static String color;
	protected double speed;
	protected double position;
	protected static double currentspeed,currentposition;
	private static Scanner cin=new Scanner(System.in);

	public Vehicle(String mod,String Color) {
		// TODO Auto-generated constructor stub
		speed=0.0;
		position=0.0;
		model=mod;
		color=Color;
		
	}
	
	String getmodel() {
		return model;
	}
	 String getcolor() {
		return color;
	}
	public double getspeed() {
		return speed;
	}
	
	public double getposition() {
		return this.position;
	}
	
	void  setspeed() {
		System.out.print("Enter Speed ");
		speed=cin.nextDouble();
	}
	void  setposition() {
		System.out.print("Enter Speed ");
		speed=cin.nextDouble();
	}
	String tostring(String Model2,String color2,double Speed2,double Accel,double Postion2) {
		
		String returnstring;
		returnstring=Model2+color2+Speed2+String.valueOf(Accel)+String.valueOf(Postion2);
		return returnstring;
		
	}
	
	protected void move() {
		
		currentspeed=speed;
		currentposition=position;
	}
	
	public abstract void accelerate();
	
	public abstract char getIcon(String classname);
	
	
}





