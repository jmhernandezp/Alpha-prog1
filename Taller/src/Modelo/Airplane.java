package Modelo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Airplane :i use breakes and ailerons";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Airplane : airport ElDorado";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Airplane : i fly very fast";
	}

}
