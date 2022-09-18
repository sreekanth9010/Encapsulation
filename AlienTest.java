package encapsulation;


class Alien
{
	private int age;
	private String name;
	
	
	public void setAge(int age) 
	{
		if(age >=18) {
			this.age = age;
		}
		else
		{
			System.out.println("minor");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
	
}
public class AlienTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien alien = new Alien(); 
		alien.setAge(33);
		alien.setName("karthik");
		System.out.println(alien.getAge());
		System.out.println(alien.getName());
	}

}
