
public class Traveler 
{
	//fields
	private int distanceTraveled;
	private String name;
	
	
	//constructor
	public Traveler(String name)
	{
		this.setDistanceTraveled(0);
		this.name = name;
	}
	
	
	//methods
	public int getDistanceTraveled()
	{
		return distanceTraveled;
	}
	
	public void travel(int miles)
	{
		setDistanceTraveled(getDistanceTraveled() + miles);
	}
	
	public String getName()
	{
		return name;
	}


	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	
}
