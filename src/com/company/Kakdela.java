package com.company;


public class Kakdela {

    public static void main(String[] args) {
        Door door = new Door();
        System.out.println();
    }
}
class Door {
int width;
int height;
boolean ifOpen = false;
Door() {
    this.height=100;
    this.width=1;




}
    public void open () {
    this.ifOpen=true;

    }
    public void close () {
    this.ifOpen = false;

    }

    @Override
    public String toString() {
        return "Door{" +
                "width=" + width +
                ", height=" + height +
                ", ifOpen=" + ifOpen +
                '}';
    }
}





