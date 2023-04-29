package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;

public class Client {

    public static void main(String[] args) {

	System.out.println("### Ordering an iPhone X");
	IPhone iPhone1 = (IPhoneX) IPhoneFactory
		.orderIPhone("iphonex");
	System.out.println(iPhone1);

	System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
	IPhone iPhone2 = (IPhone11Pro) IPhoneFactory
		.orderIPhone("iphone11pro");
	System.out.println(iPhone2);
    }
}
