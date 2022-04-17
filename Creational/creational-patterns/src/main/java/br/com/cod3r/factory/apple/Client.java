package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;

import static br.com.cod3r.factory.apple.simple.factory.IPhoneFactory.orderIPhone;

public class Client {
	
	public static void main(String[] args) {


		System.out.println("### Ordering an iPhone X");
		orderIPhone("x", "standart");

		System.out.println("\n\n### Ordering an iPhone XSMax");
		orderIPhone("x", "plus");

		System.out.println("\n\n### Ordering an iPhone 11");
		orderIPhone("11", "standart");

		System.out.println("\n\n### Ordering an iPhone 11 plus");
		orderIPhone("11", "plus");
	}
}
