package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;

public abstract class IPhoneFactory {

    public static IPhone orderIPhone(String iphoneType) {
	IPhone device = null;

	switch (iphoneType) {
	case "iphone11":
	    device = new IPhone11();
	    break;
	case "iphone11pro":
	    device = new IPhone11Pro();
	    break;
	case "iphonex":
	    device = new IPhoneX();
	    break;
	case "iphonexsmax":
	    device = new IPhoneX();
	    break;
	default:
	    break;
	}

	if (device != null) {
	    device.getHardware();
	    device.assemble();
	    device.certificates();
	    device.pack();
	}

	return device;
    }
}
