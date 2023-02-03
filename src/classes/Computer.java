package classes;

import interfaces.IBreakDown;

public class Computer extends Device {
    private boolean work;
    private String name;
    public Computer(String name){
        super(name);
        this.work = true;
    }
    public boolean getWork() {
        return work;
    }
    public void setWork(boolean work) {
        this.work = work;
    }


    @Override
    public void breakDown() {
        if (work == true){
            work = false;
        }
    }
}
