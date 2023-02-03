package classes;

public class ComputerService extends Service{

    @Override
    public void workAbility(Device device) {
        System.out.println("Имя:" + device.getName() + ", работоспособность:" + ((Computer) device).getWork());
    }

    @Override
    public void reFit(Device device) {
        ((Computer) device).setWork(true);
    }
}
