package br.com.cod3r.prototype.animation;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;

public class Client {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(100);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	private static Person addLeft(Person person){
			Person newPerson = person.clone();
			person.left();
			frames.add(newPerson);
		return person;
	}

	private static Person addRight(Person person){
		Person newPerson = person.clone();
		person.right();
		frames.add(newPerson);
		return person;
	}
	
	public static void main(String[] args) throws InterruptedException {
		PersonSamples samples = new PersonSamples();

		Person person = samples.get("fatMan");
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);

		animate();


	}
}
