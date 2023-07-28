
public class Pet {
	private String name;
	private int age; 
	private String location;
	private String type; 
	
	public Pet() {
		name = "unknown";
		age = -1;
		location = "unknown";
		type = "unknown";	
	}
	public Pet(String name, int age, String location, String type) {
		this.name = name; 
		this.age = age; 
		this.location = location;
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getType(String location) {
		this.location = location;
	}
	public void getName(String name) {
		this.name = name;
	}
}
