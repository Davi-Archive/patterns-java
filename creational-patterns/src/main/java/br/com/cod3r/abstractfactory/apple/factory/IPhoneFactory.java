package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public abstract class IPhoneFactory {
    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
	this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
	IPhone device = null;

	device = createIPhone(level);

	device.getHardware();
	device.assemble();
	device.getCertificate();
	device.certificates();
	device.getPackage();
	device.pack();

	return device;
    }

    protected abstract IPhone createIPhone(String level);
}
