package com.company.Lab1.Task1;

public class Main {
    public static void main(String[] args) {
        monitor Siemens = new monitor();

        Siemens.color = "black";
        Siemens.height = 27;
        Siemens.width = 11;
        Siemens.length = 15;
        Siemens.resolution = "1920x1080";

        monitor LG = new monitor();
        LG.color = "white";
        LG.height = 15;
        LG.width = 20;
        LG.length = 9.5;
        LG.resolution = "720x480";

        System.out.println(Siemens.length == LG.height);
        System.out.println(Siemens.resolution != LG.resolution);
    }
}
