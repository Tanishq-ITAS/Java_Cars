


public class Tesla extends Vehicle {

	
	private boolean isTwoMotor=false;
	double Teslaspeed,Accel,Position;
	public Tesla(String model,String color,boolean isTwoMotor) {
		// TODO Auto-generated constructor stub
		super(model,color);
		this.isTwoMotor=isTwoMotor;
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		if(isTwoMotor==true) {
			Teslaspeed=Teslaspeed+0.8;
		}
		else {
			Teslaspeed=Teslaspeed+0.6;
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
