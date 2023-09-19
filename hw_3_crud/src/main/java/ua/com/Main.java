package ua.com;

import ua.com.DriverController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DriverController driverController = new DriverController();
        driverController.start();
    }
}