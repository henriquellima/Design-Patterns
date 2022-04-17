package br.com.cod3r.factory.apple.halfSimple;


import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		iPhoneXFactory.orderIPhone("standart");

		System.out.println("\n\n### Ordering an iPhone X PLUS");
		iPhone11Factory.orderIPhone("plus");

	}
}
