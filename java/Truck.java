
public class Truck extends Vehicle {

	private Boolean isDeisel=false;
	double Truckspeed,Accel,Position;
	public Truck(String Model,String Color,boolean isdesiel) {
		// TODO Auto-generated constructor stub
		super(Model,Color);
		this.isDeisel=isdesiel;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		if(isDeisel==true) {
			Truckspeed=Truckspeed+0.4;
		}
		else {
			Truckspeed=Truckspeed+0.5;
		}
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
