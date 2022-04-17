package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.*;

public class IPhoneFactory {

    public static IPhone orderIPhone(String generation, String model){
        IPhone device = null;

        switch (generation){
            case "x":
                switch (model){
                    case "standart":
                        device = new IPhoneX();
                        break;
                    case "plus":
                        device = new IPhoneXSMax();
                        break;
                    default:
                        throw new RuntimeException("Model does not exist!");
                }
                break;

            case "11":
                switch (model){
                    case "plus":
                        device = new IPhone11Pro();
                        break;
                    case "standart":
                        device = new IPhone11();
                        break;
                    default:
                        throw new RuntimeException("Model does not exist!");
                }
                break;
            default:
                throw new RuntimeException("Generation does not exist!");
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;

    }
}
