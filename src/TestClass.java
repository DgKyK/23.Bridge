import device.Device;
import device.LapTop;
import device.SmartPhone;
import maker.Apple;
import maker.Xiaomi;

public class TestClass {
    public static void main(String[] args) {
        Device phone = new SmartPhone(new Apple());
        Device lp = new LapTop(new Xiaomi());

        phone.present();
        lp.present();
    }
}
