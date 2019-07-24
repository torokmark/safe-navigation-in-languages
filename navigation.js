class Address {
  constructor(city, street, number) {
    this.city = city
    this.street = street
    this.number = number
  }
}

class Person {
  constructor(name, age, address) {
    this.name = name
    this.age = age
    this.address = address
  }
}

john = new Person('john', 54, new Address('London', 'Baker', 221))
joe = new Person('joe', 54, null)

//console.log(john.address.street);
//console.log(joe.address.street);

console.log(((joe || {}).address || {}).street || 'Portobello');
console.log(((joe || {})['address'] || {})['street'] || 'Portobello' )

