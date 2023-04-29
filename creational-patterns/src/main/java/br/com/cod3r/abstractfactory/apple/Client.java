package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;

public class Client {

    public static void main(String[] args) {
	CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
	//CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
	IPhoneFactory iphone = new IPhone11Factory(rules);
	iphone.orderIPhone("standard");
    }
}
