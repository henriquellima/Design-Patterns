package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone(String model) {
        if(model.equals("standart")){
            return new IPhoneX();
        }

        if(model.equals("plus")){
            return  new IPhoneXSMax();
        }

        throw new RuntimeException("Model does not exist!");
    }
}

