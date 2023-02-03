package classes;

import interfaces.IBreakDown;

public abstract class Device implements IBreakDown {

    private String name;
    public Device(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
