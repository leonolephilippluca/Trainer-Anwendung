package dataLayer;

public class Trainer implements businessObjects.ITrainer {

	
	private int id;
	private String name;
	private int age;
	private int experience;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return age;
	}

	public void setAlter(int age) {
		this.age = age;
		
	}

	public int getExperience() {
		// TODO Auto-generated method stub
		return this.experience;
	}

	@Override
	public void setExperience(int exp) {
		this.experience = exp;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
}
