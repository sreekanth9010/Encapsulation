package encapsulation;

class Fan 
{
	private int cost;
	private String brand;
	
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public int getCost()
	{
		return cost;
	}
	public String getBrand()
	{
		return brand;
	}
}
public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan();
		fan.setCost(10000);
		fan.setBrand("BAJAJ");
		System.out.println(fan.getCost());
		System.out.println(fan.getBrand());

	}

}
