package device;

import maker.Maker;

public class PersonalComputer extends Device {
    public PersonalComputer(Maker maker) {
        super(maker);
    }

    public void deviceInfo() {
        System.out.println("PersonalComputer");
    }
}
