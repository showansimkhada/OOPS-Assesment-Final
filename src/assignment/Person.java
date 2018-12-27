package assignment;

public class Person 
{
	String Name;
	int Age;
	
	// creating the person constructor with two parameters
	Person(String Name, int Age)
	{
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public int getAge() 
	{
		return Age;
	}

	public void setAge(int age) 
	{
		Age = age;
	}
	
	// printing the name and the age if the person
	void displayInfo()
	{
		System.out.println(getName() + getAge());
	}
	
}
