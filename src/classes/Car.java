package classes;

import interfaces.IBreakDown;

public class Car extends Device {
    private boolean work;
    public Car(String name){
        super(name);
        this.work = true;
    }

    public boolean getWork() {
        return work;
    }


    public void setWork(boolean work) {
        this.work = work;
    }


    public void breakDown() {
        if(work == true){
            work = false;
        }
    }
}
