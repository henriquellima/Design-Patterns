package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazillianRulesAbstractfactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;

public class Client {
	
	public static void main(String[] args) {

		IPhone11Factory iPhone11Factory = new IPhone11Factory(new BrazillianRulesAbstractfactory());

		iPhone11Factory.orderIPhone("standard");
	}
}
