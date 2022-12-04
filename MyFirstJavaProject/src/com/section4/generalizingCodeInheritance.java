package com.section4;

/** 
 * -Generalizing code through Inheritance
 * -Object
 *   -The base class for all java class.
 *  -  Common methods equals(), toString(),hashCode()......
 * @author mahi
 *
 */
class Animal{}
class WildAnimal extends Animal{}
class DomesticAnimal extends Animal{}
class Lion extends WildAnimal{}
class Tigers extends WildAnimal{}
class Cat extends DomesticAnimal{}
class Dog extends DomesticAnimal{}
class Cow extends DomesticAnimal{}

class Human{}

public class generalizingCodeInheritance {

	public static void main(String[] args) {
       feed (new Animal());
       feed (new WildAnimal());
       feed (new DomesticAnimal());
       feed (new Lion());
       feed (new Tigers());
       feed (new Cow());
       feed (new Cat());
       feed (new Dog());
       
       feed(new Human());
	}
	
	static void feed (Object a) {
		System.out.println("Feeding an animal");
	}

}
//class list {
	//Animals arr[];     // list of all animals(we can apply more then one class)
//}
