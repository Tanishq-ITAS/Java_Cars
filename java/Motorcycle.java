

import java.util.Scanner;

public class Motorcycle extends Vehicle{

	double Moterspeed,Accel,Position;
	private static Scanner cin=new Scanner(System.in);
	public Motorcycle(String Model,String Color) {
		// TODO Auto-generated constructor stub
		super(Model,Color);
	}


	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		Moterspeed=currentspeed+Accel;
	
	}
	
   String tostring(String Model2,String color2,double Speed2,double Accel,double Postion2) {
		
		String returnstring;
		returnstring=Model2+color2+Speed2+String.valueOf(Accel)+String.valueOf(Postion2);
		return returnstring;
		
	}


@Override
public char getIcon(String classname) {
	// TODO Auto-generated method stub
	char icon=(Character) null;
	if(classname=="Truck") {
		icon='T';
	}
	if(classname=="Motorcycle") {
		icon='M';
	}
	if(classname=="Tesla") {
		icon='E';
	}
	return icon;
}

}
