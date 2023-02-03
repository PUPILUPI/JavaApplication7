package classes;

import interfaces.IBreakDown;

public class CarService extends Service {

    public void workAbility(Device device) {
        System.out.println("Имя:" + device.getName() + ", работоспособность:" + ((Car) device).getWork());
    }


   public void reFit(Device device) {
        ((Car) device).setWork(true);

    }
}
