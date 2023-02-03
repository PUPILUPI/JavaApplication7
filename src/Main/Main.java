package Main;

import classes.*;

public class Main {
    public static void main(String[] args) {
     Device computer = new Computer("hp");
     Device car = new Car("bmv");
     ComputerService comp = new ComputerService();
     CarService  c = new CarService();
     comp.workAbility(computer);
     c.workAbility(car);
     car.breakDown();
     ((Computer) computer).breakDown();
     comp.workAbility(computer);
     try {
      c.workAbility(computer);
     }catch(ClassCastException e){
      System.out.println("Вы пытаетесь починить компьютер в машинном сервисе!");
     }
     comp.reFit(computer);
     c.reFit(car);
     comp.workAbility(computer);
     c.workAbility(car);

    }


}