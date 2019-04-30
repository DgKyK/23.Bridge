package device;

import maker.Maker;

public abstract class Device {
    private Maker maker;

    public Device(Maker maker) {
        this.maker = maker;
    }

    public void present() {
        maker.showMaker();
        deviceInfo();
    }

    public abstract void deviceInfo();


}
