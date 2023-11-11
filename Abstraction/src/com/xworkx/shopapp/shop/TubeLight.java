package com.xworkx.shopapp.shop;

public class TubeLight implements Switch{  // class - extends , interface - implements.


    @Override
    public void sOn(){
        System.out.println("The light is turned on");
    }

    public void sOff(){
        System.out.println("The light is turned off");
    }
}
