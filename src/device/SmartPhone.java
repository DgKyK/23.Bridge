package device;

import maker.Maker;

public class SmartPhone extends Device {
    public SmartPhone(Maker maker) {
        super(maker);
    }

    public void deviceInfo() {
        System.out.println("SmartPhone");
    }
}
