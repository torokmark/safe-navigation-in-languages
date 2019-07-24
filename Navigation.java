
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

class Address {
  private String city;
  private String street;
  private int number;

  Address(String city, String street, int number) {
    this.city = city;
    this.street = street;
    this.number = number;
  }

  String getCity() {
    return city;
  }

  String getStreet() {
    return street;
  }

  int getNumber() {
    return number;
  }
}

class Person {
  private String name;
  private int age;
  private Address address;

  Person(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  Address getAddress() {
    return address;
  }
  
}

public class Navigation {
  public static void main(String[] args) {
    // Embedded objects
    Person john = new Person("John", 54, new Address("Paris", "Champs-Elysee", 54));
    Person joe = new Person("Joe", 54, null);

    //System.out.println(john.getAddress().getStreet()); // emits the street name
    //System.out.println(joe.getAddress().getStreet()); // raises NPE
 
    String street = Optional.of(john)
        .map(Person::getAddress)
        .map(Address::getStreet)
        .orElse("N/A");
    System.out.println(street);
    street = Optional.of(joe)
        .map(Person::getAddress)
        .map(Address::getStreet)
        .orElse("N/A");
    System.out.println(street);
  
    // Map
    Map<String, Map> hsh = new HashMap<String, Map>();
    Map<String, Integer> people = new HashMap<String, Integer>() {{
      put("john", 54);
    }};
    hsh.put("London", people); 

    //System.out.println(hsh.get("London").get("john"));  
    //System.out.println(hsh.get("Paris").get("john"));  

    System.out.println(hsh.getOrDefault("London", new HashMap<String, Integer>()).getOrDefault("john", -1));
    System.out.println(hsh.getOrDefault("Paris", new HashMap<String, Integer>()).getOrDefault("john", -1));
  }

}
