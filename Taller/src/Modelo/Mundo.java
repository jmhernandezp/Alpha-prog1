package Modelo;
import Modelo.*;
public class Mundo {
private Superman s;
private Bird b;
private Airplane a;
	public String eats() {
	return s.eat()+b.eat();
	
}
	public String fly() {
		return s.fly()+
		b.fly()+
		a.fly();
	}
	
	public String takeoff()
	{
		return s.takeoff()+
		b.takeoff()+
		a.takeoff();
	}
	public String nets()
	{
		return b.buildnest();
		
	}
	public String lands()
	{
		return a.land()+
		b.land()+
		s.land();
	}
	public String leapBuldin()
	{
		return s.leapBuilding();
	}
	public String stop()
	{
		return s.stopBullets();
	}
	public String eggs()
	{
		return b.layEggs();
	}
	
	
}
