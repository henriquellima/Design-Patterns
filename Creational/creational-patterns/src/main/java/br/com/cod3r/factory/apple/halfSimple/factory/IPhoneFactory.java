package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String model) {

        IPhone device = null;

        device = createIphone(model);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String model);

}
