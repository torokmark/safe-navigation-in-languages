using System;
					
public class Navigation
{
	public static void Main(String[] args)
	{
		var address = new Address();
		address.City = "London";
		address.Street = "Baker";
		address.Number = 221;
		
		var john = new Person();
		john.Name = "John";
		john.Age = 54;
		john.Address = address;
		
		var joe = new Person();
		joe.Name = "John";
		joe.Age = 54;
		Console.WriteLine(john?.Address?.Street ?? "Portobello");
		Console.WriteLine(joe?.Address?.Street ?? "Portobello");
	}
}

public class Address
{
	public String City {get; set;}
	public String Street {get; set;}
	public Int32 Number {get; set;}
}

public class Person
{
	public String Name {get; set;}
	public Int32 Age {get; set;}
	public Address Address {get; set;}
}


