package Modelo;

public class Bird extends animal implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "bird: o fuck";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "bird: oh my lands";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "bird: MAYDAY";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "bird: I EAT NUTS";
	
	}
	public String buildnest()
	{
		return "bird: nest create";
	}
	public String layEggs()
	{
		return "bird: shhhh i try lay eggs";
	}
}
