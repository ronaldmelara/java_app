import Smart.SmartPhone;
import Smart.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("A20s","Samsung", "negro");
        SmartWatch watch = new SmartWatch("Fit 2", "Huawei", "Plata");

        phone.connect();
        watch.connect();


        System.out.println(phone);
        System.out.println(watch);

    }
}