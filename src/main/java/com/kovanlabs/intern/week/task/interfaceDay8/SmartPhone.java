package com.kovanlabs.intern.week.task.interfaceDay8;

interface Camera{
    default String execute(){
        return "Executing Camera";
    }
}
interface MusicPlayer{
    default String execute(){
        return "Executing MusicPlayer";
    }
}
interface Phone{
    default String execute(){
        return "Executing Phone";
    }
}

public class SmartPhone implements Camera,MusicPlayer,Phone{

    public String execute() {
        return "SmartPhone Executed";
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone.execute());

    }

}
