
public class Animal {
	
	private String name; 
	private int age; 
	private boolean alive; 
	
	public Animal() {
		name = "unknown";
		age = -1;
		alive = false;
	}
	
	public Animal(String name, int age) {
		this.name = name; 
		this.age = age;
		this.alive = true;
	}
	
	public Animal(String name, int age, boolean alive) {
		this.name = name; 
		this.age = age; 
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getStatus() {
		return alive;
	}

	public void setStatus(boolean status) {
		alive = status;
	}
	
	public boolean deservesTreat() {
		return age > 5;
	}
	
	public String stats() {
		return ("Name: " + name + "Age: " + age);
	}
}