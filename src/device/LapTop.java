package device;

import maker.Maker;

public class LapTop extends Device {
    public LapTop(Maker maker) {
        super(maker);
    }

    public void deviceInfo() {
        System.out.println("LapTop");
    }
}
